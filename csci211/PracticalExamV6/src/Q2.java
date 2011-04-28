
import java.util.Scanner;

import edu.olemiss.cs211.*;

public class Q2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		BinarySearchTree<Integer> giving = new BinarySearchTree<Integer>();
		
		System.out.print("Enter a number, or EOF (cntl-Z) to quit:");

		while(s.hasNext()){
			
			int x = s.nextInt();
			
			// Probably do something here.
			giving.add(x);
			
			System.out.print("Enter a number, or EOF (cntl-Z) to quit:");			
		}
		
		System.out.println();
		System.out.println("Sorted numbers:");
		giving.printInorder();
		// print out the sorted numbers here.
	
	
	}

}
