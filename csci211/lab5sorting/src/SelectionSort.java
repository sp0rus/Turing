import java.io.*;
import java.util.*;

class SelectionSort {
    private static int comparisons;
    public static void swap(int[] a, int p, int q) {
        int temp = a[p];
        a[p]     = a[q];
        a[q]     = temp;
    }
    public static void selection_sort(int[] a) {
    	for(int i = 0; i<a.length; i++){
    	    int minj = i;
    	    int minx = a[i];
    	    for(int j = i+1; j < a.length; j++){
    	        if(a[j] < minx){
    	            minj = j;
    	            minx = a[j];
    	        }
    	        comparisons++;
    	    }
    	    a[minj] = a[i];
    	    a[i] = minx;
    	}
    }
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(new File("A.in"));
        // Start a counter for the number of comparisons
        comparisons = 0;
        // Declare the array of 1000 integers
        int[] a = new int[1000];
        // Read the integers into the array
        for (int i = 0; i < 1000; i++) {
            a[i] = scan.nextInt();
        }
        selection_sort(a);
        System.out.println("Comparisions of 1000 elements using selection sort: "+comparisons);
        for(int i=0; i<a.length; i++){
        	System.out.println((i+1) + ": " + a[i]);
        }
    }

}
