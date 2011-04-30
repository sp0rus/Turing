/****************************************************
* NAME: John Stitt jmstitt@gmail.com
* EXERCISE NUMBER: 3
* PROGRAM TITLE/TOPIC: Simple Sudoku
* COURSE INFORMATION: CSCI 112; Summer 2010
* INSTRUCTOR: James Church (jcchurch@olemiss.edu)
* CURRENT DATE: 7/15/2010
*
* HONOR CODE STATEMENT:
* In keeping with the Honor Code policies of the University of
* Mississippi, the School of Engineering, and the Department of
* Computer and Information Science, I affirm that I have neither
* given nor received assistance on this programming exercise.
*
* PROGRAM DESCRIPTION:
* Program asks user for input of a filename.  The file should contain 80 out of 81 digits in a sudoku 
* puzzle.  The program then puts the puzzle into a two-dimensional array and solves what the remaining * number is.  After this the program prints the solved puzzle to the screen.
****************************************************/

import java.io.*;
import java.util.*;

class SimpleSudoku {
    private int height;
    private int width;
    private int[][] grid;

    /**
     * Constructs a grid based on the contents of the input file.
     * @param filename input file containing 80 out of 81 values.
     */
    public SimpleSudoku(String filename) {
        Scanner scan = null;
        try {
            scan = new Scanner(new File(filename));
        }
        catch (Exception e) {
            System.out.println("File not found: "+filename);
        }
        
        //instatiate grid and populate it with numbers from file
        height = 9;
        width = 9;
        grid = new int[height][width];

        for( int i = 0; i < height; i++ ){
        	for( int j = 0; j < width; j++ ){
        		grid[i][j] = scan.nextInt();
        	}
        }
    }

    /**
     * Solves the grid, assuming there is only one value missing.
     */
    public void solve() {
    	for( int i = 0; i < height; i++ ){
        	for( int j = 0; j < width; j++ ){
        		if( grid[i][j] == 0 ){
        			int sum = 0;
        			int completeRow = 45;
        			for( int k = 0; k < width; k++ ){
        				sum += grid[i][k];
        			}
                    grid[i][j] = completeRow - sum;
        		}
        	}
        }
    }

    /**
     * Prints the grid to the screen.
     */
    public void print() {
    	for( int i = 0; i < height; i++ ){
    		for( int j = 0; j < width; j++ ){
    			System.out.print( grid[i][j] + " " );
    		}
    		System.out.println();
    	}
    }
}