import java.util.Iterator;
import java.util.NoSuchElementException;

public class Queue<T> implements Iterable<T> {
    private int N;         // number of elements on queue
    private Node first;    // beginning of queue
    private Node last;     // end of queue

    // helper linked list class
    private class Node {
        private BinaryTreeNode item;
        private Node next;
    }

    // create an empty queue
    public Queue() {
        first = null;
        last  = null;
    }

    // is the queue empty?
    public boolean isEmpty() { return first == null; }
    public int length()      { return N;             }
    public int size()        { return N;             }

    // add an item to the queue
    public void enqueue(BinaryTreeNode root) {
        Node x = new Node();
        x.item = root;
        if (isEmpty()) { first = x;     last = x; }
        else           { last.next = x; last = x; }
        N++;
    }

    // remove and return the least recently added item
    public BinaryTreeNode dequeue() {
        if (isEmpty()) throw new RuntimeException("Queue underflow");
        BinaryTreeNode item = first.item;
        first = first.next;
        N--;
        return item;
    }

    // string representation (inefficient because of string concatenation)
    public String toString() {
        String s = "";
        for (Node x = first; x != null; x = x.next)
            s += x.item + " ";
        return s;
    }

    public Iterator<T> iterator()  { return new QueueIterator();  }

    // an iterator, doesn't implement remove() since it's optional
    private class QueueIterator implements Iterator<BinaryTreeNode> {
        private Node current = first;

        public boolean hasNext()  { return current != null; }
        public void remove() { throw new UnsupportedOperationException(); }

        public BinaryTreeNode next() {
            if (!hasNext()) throw new NoSuchElementException();
            BinaryTreeNode item = current.item;
            current = current.next; 
            return item;
        }
    }
}