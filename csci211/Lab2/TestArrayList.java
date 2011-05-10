import java.util.*;

public class TestArrayList {
	public static void main( String[] args ){
		ArrayList a = new ArrayList();
	
		long t1;
		long t2;
		int iterations = 10000;
	
		a.ensureCapacity(10001);
	
		for( int i = 0; i < iterations; i++ ){
			t1 = System.nanoTime();
			a.add(i);
			t2 = System.nanoTime();
			System.out.println( (t2-t1) );
		}
	}
}
