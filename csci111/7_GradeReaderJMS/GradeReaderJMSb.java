import java.util.Scanner;
import java.text.DecimalFormat;

public class GradeReaderJMSb
{
    static final int SENTINEL = -1;
    
    public static void main( String [] args )
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
        
        Scanner scan = new Scanner( System.in );

        System.out.println( "Welcome to the Grade Reader.\n" );

        System.out.print( "Enter the first grade or -1 to process all grades > " );
        grade = scan.nextInt( );
        
        System.out.println( "You input the grade " + grade + ".\n" );

        do
        {
            totalGrades ++;
            
            if ( grade < 0 || grade > 100 )
            {
                System.out.println( "The grade " + grade + " is invalid as it was outside the valid range (0-100)." ); // error message letting user know that a grade fell outside of range to be processed
                invalidCount++; // adds "1" to the number of invalid grades processed
                
                System.out.print( "Enter the next grade or -1 to process all grades > " );
                grade = scan.nextInt( );
            }
                
            else
            {
                sum += grade; // adds the current valid grade being processed to the sum
                validCount++; // adds "1" the the # of valid grades processed
                    
                System.out.println( "You input the grade " + grade + ".\n" );
                
                System.out.print( "Enter the next grade or -1 to process all grades > " );
                grade = scan.nextInt( );
                    
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
        } while ( grade != SENTINEL );
        
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
     
        System.out.println( "\n" );
          
        System.out.println( "All grades processed.  Goodbye." );  // lets user know the file has been completely processed
    }
}