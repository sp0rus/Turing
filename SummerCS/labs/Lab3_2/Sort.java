
public class Sort {
	static void bubble_sort( int[] a ) {
		while( true ){
			boolean swapped = false;
			for( int i = 0; i < a.length - 1; i ++ ){
				if( a[i] > a[i+1] ){
					swap( a, i, i+1 );
					swapped = true;
				}
			}
			if( swapped == false )
				break;
		}
	}
	static void gap_sort( int[] a ){
		for( int gap = a.length -1; gap >= 1; gap-- ){
			for( int i = 0; i + gap < a.length; i++ ){
				if( a[i] > a[gap+i] ){
					swap( a, i, gap+i );	
				}
			}
		}
	}
	static void swap(int[] a, int p, int q) {
		int temp = a[p];
		a[p]     = a[q];
		a[q]     = temp;
	} // End swap
}