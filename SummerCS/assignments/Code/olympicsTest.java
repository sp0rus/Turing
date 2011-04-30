/****************************************************
* NAME: John Stitt jmstitt@olemiss.edu
* EXERCISE NUMBER: 1
* PROGRAM TITLE/TOPIC: Olympics
* COURSE INFORMATION: CSCI 112; Summer 2010
* INSTRUCTOR: James Church (jcchurch@olemiss.edu)
* CURRENT DATE: 7/9/2010
*
* HONOR CODE STATEMENT:
* In keeping with the Honor Code policies of the University of
* Mississippi, the School of Engineering, and the Department of
* Computer and Information Science, I affirm that I have neither
* given nor received assistance on this programming exercise.
*
* PROGRAM DESCRIPTION:
* Program asks for user input of 8 scores for a competition.  If the scores are otuside the bounds (0.0-6.0), 
* the program returns an error and asks for re-entry.  After all the scores are entered, the program then 
* prints the final score (sum of scores excluding both highest and lowest scores).  
****************************************************/

public class olympicsTest {
	public static void main( String[] args ){
		Olympics blarg = new Olympics();
		
		blarg.getInput();
		
		System.out.println(blarg.displayOutput());
	}

}