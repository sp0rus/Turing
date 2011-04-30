import java.util.Scanner;

public class GapTest {
	public static void main(String[] args) {
		int[] a = new int[7];
		Scanner scan = new Scanner( System.in );
		
		System.out.println( "Enter 7 numbers to be sorted with Gap Sort: " );
		
		for( int i = 0; i < a.length; i++ ){
			System.out.print( "Number " + (i+1) + ": " );
			a[i] = scan.nextInt();
		}
		Sort.gap_sort(a);
		System.out.println( "Sorted Numbers:" );
		for( int i = 0; i < a.length; i++ ){
			System.out.print( a[i] + " " );
		}
	}
}
