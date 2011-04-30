import java.util.*;

public class drunk {
	static void drunk_sort( int[] a ){
		Random rng = new Random();
		boolean sorted = true;
		
		while( true ){
			for( int i = 0; i < a.length; i++ ){
				swap( a, i, rng.nextInt( a.length ) );
			}
			sorted = true;
			for( int i = 0; i < a.length -1; i++ ){
				if( a[i] > a[i+1] ){
					sorted = false;
				}
			}
			if( sorted )
				break;
		}
	}
	static void swap(int[] a, int p, int q) {
		int temp = a[p];
		a[p]     = a[q];
		a[q]     = temp;
	} // End swap
	public static void main( String[] args ){
		int[] a = new int[8];
		Random rngTwo = new Random();
		
		System.out.println( "Populating an array to be sorted with Drunk Sort..." );
		
		for( int i = 0; i < a.length; i++ ){
			a[i] = rngTwo.nextInt( 8 );
		}
		
		System.out.println("Sorting...");
		
		long start = System.currentTimeMillis();
		drunk_sort(a);
		long runtime = System.currentTimeMillis() - start;
		
		System.out.println( "Sorted Numbers:" );
		for( int i = 0; i < a.length; i++ ){
			System.out.print( a[i] + " " );
		}
		System.out.println();
		System.out.println( "Runtime: " + runtime + " milliseconds" );
	}
}
