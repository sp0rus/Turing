/****************************************************
* NAME: John Stitt jmstitt@olemiss.edu
* EXERCISE NUMBER: 1
* PROGRAM TITLE/TOPIC: Case Changing
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

import java.util.*;

class Olympics {
	
	public double[] scores = new double[8];
    public final double ABOVEBOUNDS = 7;
	Scanner scan = new Scanner(System.in);
    
	
	//method getInput gets the scores from the user while making sure they are within the bounds
	public double[] getInput(){
		System.out.println( "Enter the 8 judging scores for this competition.");
		System.out.println();
		
		for( int i = 0; i < scores.length; i++){
			double current = -1;
			do{
				System.out.print( "Score " + (i+1) + ": ");
				current = scan.nextDouble();
				if( current >= 0 && current <= 6){
					scores[i] = current;
				}
				else{
					System.out.println( "That score does not range from 0.0 to 6.0. Please enter the score again" );
				}
			}while(current < 0 || current > 6);
		}
		System.out.println();
		return scores;
	}
	
	//method sum computes the sum of all the scores entered by the user
	public double sum (double[] scores){
		double sum = 0;
		this.scores = scores;
		for( int i = 0; i < this.scores.length; i++){
			sum = sum + this.scores[i];
		}
		return sum;
		
	}
	
	//max finds the highest score
	public double max (double[] scores){
		double max = 0;
		this.scores = scores;
		for( int i = 0; i < this.scores.length; i++){
			if( this.scores[i] > max ){
				max = this.scores[i];
			}
		}
		return max;
	}
	
	//min finds the lowest score
	public double min (double[] scores){
		double min = ABOVEBOUNDS;
		this.scores = scores;
		for( int i = 0; i < this.scores.length; i++){
			if( this.scores[i] < min ){
				min = this.scores[i];
			}
		}
		return min;
	}
	
	//displayOutput computes and shows the final score
	public String displayOutput(){
		double score = sum(scores)-min(scores)-max(scores);
		return "The score for this event is " + score;
	}
}
