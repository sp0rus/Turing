import java.io.*; 
import java.util.*; 

class QuickSort { 
    static int comparisons; 
    /*
    private static void swap(int[] a, int p, int q) { 
        int temp = a[p]; 
        a[p]     = a[q]; 
        a[q]     = temp; 
    } 
	*/
    private static void quick_sort(int[] a, int p, int q) {     
    	if(q-p >1){
    		int pivot = partition(a, p, q);
    		quick_sort(a, p, pivot);
    		quick_sort(a, pivot+1, q);
    	}
    }

    private static int partition(int[] a, int p, int q) {     
    	int pivot = a[p];
    	int i = p;
    	int j = q;
    	while(i<j){
    		//walk backwards until find a number smaller than the pivot
    		while(j>i && a[j]>=pivot){ 
    			j--;
    			comparisons++;
    		}
    		if(j>i){
    			a[i]=a[j];
    		}
    		while(i<j && a[i]<=pivot){
    			i++;
    			comparisons++;
    		}
    		if(i<j){
    			a[j]=a[i];
    		}
    	}
    	a[j]=pivot;
		return j;
    } // End partition 

    public static void main(String[] args) throws FileNotFoundException { 
        Scanner scan = new Scanner(new File("A.in")); 

        // Start a counter for the number of comparisons 
        comparisons = 0; 

        // Declare the array of 1000 integers 
        int[] a = new int[1000]; 

        // Read the integers into the array 
        for (int i = 0; i < 1000; i++) { 
            a[i] = scan.nextInt(); 
        } 

        quick_sort(a, 0, a.length-1); 
        //java.util.Arrays.sort(a);

        System.out.println("Comparisons of 1000 elements using QuickSort: "+comparisons); 
        for(int i = 0; i<a.length; i++){
        	System.out.println(a[i]);
        	//System.out.println(i);
        }
    } 
}
