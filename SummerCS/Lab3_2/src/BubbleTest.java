import java.util.*;

public class BubbleTest {
	public static void main(String[] args) {
		int[] a = new int[7];
		Scanner scan = new Scanner( System.in );
		
		System.out.println( "Enter 7 numbers to be sorted: " );
		
		for( int i = 0; i < a.length; i++ ){
			System.out.print( "Number " + (i+1) + ": " );
			a[i] = scan.nextInt();
		}
		Sort.bubble_sort(a);
		System.out.println( "Sorted Numbers:" );
		for( int i = 0; i < a.length; i++ ){
			System.out.print( a[i] + " " );
		}
	}

}
