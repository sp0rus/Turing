import java.io.*;
import java.util.*;

class MergeSort {
    private static int comparisons;

    public static void merge_sort(int[] a, int[] b, int low, int high) {
    	if( low < high ) {
            int center = ( low + high ) / 2;
            merge_sort( a, b, low, center );
            merge_sort( a, b, center + 1, high );
            merge( a, b, low, center + 1, high );
        }
    }
    public static void merge(int[] a, int[] b, int low, int middle, int high) {
    	int leftEnd = middle - 1;
        int tmpPos = low;
        int numElements = high - low + 1;
        
        while( low <= leftEnd && middle <= high ){
            if( a[ low ]/( a[ middle ] ) <= 0 ){
                b[ tmpPos++ ] = a[ low++ ];
        		comparisons++;
            }
            else{
                b[ tmpPos++ ] = a[ middle++ ];  
            	comparisons++;
            }
        }
        while( low <= leftEnd )
            b[ tmpPos++ ] = a[ low++ ];
        while( middle <= high )
            b[ tmpPos++ ] = a[ middle++ ];
        for( int i = 0; i < numElements; i++, high-- )
            a[ high ] = b[ high ];
    }
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(new File("A.in"));
        // Start a counter for the number of comparisons
        comparisons = 0;
        // Declare the array of 1000 integers
        int[] a = new int[1000];
        int[] b = new int[1000]; // Auxiliary buffer required by merge sort
        // Read the integers into the array
        for (int i = 0; i < 1000; i++) {
            a[i] = scan.nextInt();
        }
        merge_sort(a, b, 0, a.length-1);
        System.out.println("Comparisons of 1000 elements using merge sort: "+comparisons);
        for(int i=0; i<a.length; i++){
        	System.out.println((i+1) + ": " + a[i]);
        }
    }
}
