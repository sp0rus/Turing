

import java.util.Scanner;

import edu.olemiss.cs211.*;
public class Q3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {		
		
		
		Scanner s = new Scanner(System.in);
		
		HashTable<String, Integer> table = new HashTable<String, Integer>(100);

		System.out.print("Enter a word (the key), or EOF (cntl-D) to quit:");
		
		
		while(s.hasNext()){
			
			String key=s.next();
			System.out.print("enter the corresponding integer value for the key :"+key+" -> ");
			
			Integer value= s.nextInt();				
					
			table.add(key, value);
			
			System.out.print("Enter key, or EOF (cntl-D) to quit:");			
		}
		
		System.out.println("All Values in the table:");

		System.out.println(table); // Automatically calls toString() for the HashTable class.
		
	}

}
