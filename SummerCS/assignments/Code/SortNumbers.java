/****************************************************
* NAME: John Stitt jmstitt@olemiss.edu
* EXERCISE NUMBER: 4
* PROGRAM TITLE/TOPIC: Sorting 20 Numbers
* COURSE INFORMATION: CSCI 112; Summer 2010
* INSTRUCTOR: James Church (jcchurch@olemiss.edu)
* CURRENT DATE: 7/20/2010
*
* HONOR CODE STATEMENT:
* In keeping with the Honor Code policies of the University of
* Mississippi, the School of Engineering, and the Department of
* Computer and Information Science, I affirm that I have neither
* given nor received assistance on this programming exercise.
*
* PROGRAM DESCRIPTION:
* [Brief description of what this program does.]
****************************************************/

import java.util.*;

public class SortNumbers {
	public static void main( String[] args ){
		int[] testNumbers = new int[20];
		
		getInput(testNumbers);
		
		SelectionSort(testNumbers);
		
		displayOutput(testNumbers);
	}
	/* 
	 * getInput asks the user for numbers to be sorted 
	 * and inserts them into an array
	 */
	public static void getInput(int[] array){
		Scanner scan = new Scanner( System.in );
		System.out.println( "Input 20 numbers to be sorted." );
		for( int i = 0; i < array.length; i++ ){
			System.out.print( "Number " + (i+1) + ": " );
			array[i] = scan.nextInt();
		}
	}
	/*
	 * SelectionSort method utilizes an algorithm to perform
	 * a Selection Sort on the numbers received from the user
	 */
	public static void SelectionSort(int[] array){
		for( int i = 0; i < array.length -1; i++ ){
			int minPosition = i;
			
			for( int j = i+1; j < array.length; j++ ){
				if( array[j] < array[minPosition] )
					minPosition = j;
			}
			int temp = array[i];
			array[i] = array[minPosition];
			array[minPosition] = temp;
		}
	}
	/*
	 * displayOutput prints the sorted numbers to the screen
	 */
	public static void displayOutput(int[] array){
        System.out.println();
        System.out.println( "Your numbers, sorted:" );
		for( int i = 0; i < array.length; i++ ){
			System.out.print( array[i] + " " );
		}
	}
}
