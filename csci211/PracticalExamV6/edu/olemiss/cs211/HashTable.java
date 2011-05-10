package edu.olemiss.cs211;

import java.util.Iterator;

/** A Hash Table class that represents associations between keys and values.
 * An association is just a tuple <k,v>. So, we might add <"foo", 12> to this
 * hash table, associating the string "foo" with the number 12. The key "foo"
 * is used to determine where in the hashtable the tuple is stored. Key
 * types should have a robust implementation of hashCode().
 * 
 * @author rhodes
 *
 * @param <K> The key type.
 * @param <V> The value type.
 */
public class HashTable<K, V> implements Iterable<V> {
	
	List<HashNode<K,V>> [] table;
	
	
	/** Create a hash table of the specified size.
	 * 
	 * @param tableSize size of the table
	 */
	@SuppressWarnings("unchecked")
	public HashTable(int tableSize){
		
		this.table = new List[tableSize];
	
		for(int i=0; i<tableSize; i++){
			
			this.table[i] = new List<HashNode<K,V>>();
		}
	}
	/** Add an association <k, v> to the hash table.
	 *  The key can later to be used with the find() method
	 *  to retrieve the value v.
	 * @param key used to choose a position in the table.
	 * @param v the value to be associated with the key
	 */
	public void add(K key, V v){
		
		int index = Math.abs(key.hashCode()) % table.length;
		
		this.table[index].add(new HashNode<K,V>(key,v));
	}
	
	/** Return the value corresponding to the key k.
	 * 
	 * @param k the key
	 * @return the value
	 */
	public V find(K k){
		
		int index = Math.abs(k.hashCode()) % table.length;
		
		return this.table[index].find(k).value();
	}
	
	
	/** Return a string representing all the values (not keys)
	 *  in the hash table.
	 */
	public String toString(){
		
		StringBuffer retval = new StringBuffer();
		
		//Write me.
		
		return retval.toString();
	}
	
	
	/** An inner class used to represent the 
	 * association between a key and a value.
	 * @author rhodes
	 *
	 * @param <K1> the key type
	 * @param <V1> the value type
	 */
	protected class HashNode<K1, V1> {
		
		protected K key;
		protected V value;
		
		HashNode(K aKey, V aValue) {
			
			key = aKey;
			value = aValue;
		}
		
		public boolean equals(Object aKey){
			
			return key.equals(aKey);
		}
		
		V value(){
			
			return value;
		}
	}
	
	/** An iterator class that iterates over all the values stored in
	 *  a HashTable. 
	 * @author rhodes
	 *
	 * @param <V>
	 */

	public class HashTableIterator<V1 extends V> implements Iterator<V> {
		
		HashTable<K,V> table=null;
		int nextTableIndex;
		Iterator<HashNode<K,V>> listIterator;
		
		/** Create a HashTableIterator associated with the given hash table.
		 * 
		 * @param theTable
		 */
		public HashTableIterator(HashTable<K,V> theTable){
			
			this.table = theTable;
			this.listIterator = new CS211Iterator<HashNode<K,V>>(theTable.table[0]);
			this.nextTableIndex=1;
		}

		/** Returns the next value in the hash table iteration.
		 * 
		 */
		public V next(){
						
			while((nextTableIndex!=this.table.table.length) && !this.listIterator.hasNext()){
				
				this.listIterator = new CS211Iterator<HashNode<K,V>>(this.table.table[this.nextTableIndex]);
				this.nextTableIndex++;			
			}
			
			if(nextTableIndex != this.table.table.length){
				
				return this.listIterator.next().value();
			} else {
				
				throw new java.util.NoSuchElementException();
			}
		}
		
		
		/** Indicates whether the iterator has any more values.
		 * 
		 */
		public boolean hasNext(){
			
			while((nextTableIndex!=this.table.table.length) && !this.listIterator.hasNext()){
				
				this.listIterator = new CS211Iterator<HashNode<K,V>>(this.table.table[this.nextTableIndex]);
				this.nextTableIndex++;			
			}
						
			return (nextTableIndex != this.table.table.length);			
		}
		
		/** Unsupported Operation. */
		public void remove(){
			
			throw new java.lang.UnsupportedOperationException();
		}
	}

	/** Return an iterator associated with this HashTable.*/
	public Iterator<V> iterator() {
		
		return new HashTableIterator<V>(this);
	}

	
}
