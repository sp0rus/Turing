/*
     Name: John M. Stitt
     Email: jmstitt@olemiss.edu	
     Program Source File Name: GraderJMS.java
     Current Date: October 6, 2009
     Course Information: CSci 111 - Section 01
     Instructor: Ms. C. B. Zickos
     Program Description: Program reads grades from a file.  The program then adds each grade to an accumulator and determines if the grade is the minimum or maximum grade it has recieved, as well as checking that it is, in fact, a valid grade.  Then the program gives the average grade, the minimum grade, the maximum grade, the total number of grades processed, the total number of invalid grades, and the number of grades in each "Letter Grade" category.
     Sources Consulted: Book source code, handout, random.org for random grade generation
     Honor Code Statement: In keeping with the honor code policies of the University of Mississippi, the School of Engineering, and the Department of Computer and Information Science, I affirm that I have neither given nor received assistance on this programming assignment. This assignment represents my individual, original effort.
                    ... My Signature is on File.
*/ 

//import needed java classes
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;

public class GraderJMS
{
    public static void main( String [] args ) throws IOException
    {
        // declare variables for use in program
        int grade; // variable used for current grade being processed
        int sum = 0; // variable for the sum of valid grades
        int maxGrade = -1; // variable for the highest grade processed
        int minGrade = 101; // variable for the lowest grade processed
        int invalidCount = 0; // variable to count # of invalid grades
        int totalGrades = 0; // variable to count # of grades processed
        int validCount = 0; // variable to count # of valid grades
        // declare variables for "letter grades"
        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int dCount = 0;
        int fCount = 0;

        File inputFile = new File( "grades.txt" ); // declare what file to scan for input
        Scanner scan = new Scanner( inputFile );
     
        System.out.println( "This program has processed grades from the grades.txt file.\n" ); // let user know what program's purpose is
     
        if ( ! scan.hasNext( ) )
        {
            System.out.println( "No test grades are in the file" ); // output error message if no grades are in the file
        }
        else
        {
            while ( scan.hasNext( ) )
            {
                grade = scan.nextInt( );  // read next grade
                totalGrades++; // add "1" to the number of grades processed
                
                if ( grade < 0 || grade > 100 )
                {
                    System.out.println( "The grade " + grade + " is invalid as it was outside the valid range (0-100)." ); // error message letting user know that a grade fell outside of range to be processed, and tells user which grade it was
                    invalidCount++; // adds "1" to the number of invalid grades processed
                }
                
                else
                {
                    sum += grade; // adds the current valid grade being processed to the sum
                    validCount++; // adds "1" the the # of valid grades processed
                    
                    if ( grade >= 90 )
                    {
                        aCount++; // adds "1" the the # of "A" grades processed
                    }
                    else if ( grade >= 80 )
                    {
                        bCount++; // adds "1" the the # of "B" grades processed
                    }
                    else if ( grade >= 70 )
                    {
                        cCount++; // adds "1" the the # of "C" grades processed
                    }
                    else if ( grade >= 60 )
                    {
                        dCount++; // adds "1" the the # of "D" grades processed
                    }
                    else if ( grade >= 0 )
                    {
                        fCount++; // adds "1" the the # of "F" grades processed
                    }
                    
                    if ( grade > maxGrade ) // checks if grade is higher than the current maximum grade
                    {
                        maxGrade = grade;    // save as current maximum grade
                    }
                    if ( grade < minGrade ) // checks if grade is lower than the current minimum grade
                    {
                        minGrade = grade;    // save as current minimum grade
                    }
                }
            } 
     
     
        System.out.println( "\n" );
     
        DecimalFormat average = new DecimalFormat( "0" );
        System.out.println( "The average grade was: " + average.format( (double) ( sum ) / validCount ) ); //outputs the average of all valid grades rounded to the nearest integer
        System.out.println( "The highest grade was: " + maxGrade ); // outputs the highest (maximum) valid grade processed
        System.out.println( "The lowest grade was: " + minGrade ); // outputs the lowest (minimum) valid grade processed
     
        System.out.println( "\n" );
     
        System.out.println( "Number of A's (grades from 90-100): " + aCount );
        System.out.println( "Number of B's (grades from 80-89): " + bCount );
        System.out.println( "Number of C's (grades from 70-79): " + cCount );
        System.out.println( "Number of D's (grades from 60-69): " + dCount );
        System.out.println( "Number of F's (grades from 0-59): " + fCount );
        
        System.out.println( "\n" );
     
        System.out.println( "The number of invalid grades was: " + invalidCount ); // outputs # of invalid grades
        System.out.println( "The number of valid grades was: " + validCount ); // outputs # of valid grades
        System.out.println( "The total number of grades processed was: " + totalGrades ); // outputs total # of grades processed
        }
     
        System.out.println( "\n" );
          
        System.out.println( "End of file detected. Goodbye" );  // lets user know the file has been completely processed
    }
}
