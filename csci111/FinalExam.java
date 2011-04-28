/*
Program by: John Stitt
Date: December 9, 2009
*/

import java.util.Scanner;

public class FinalExam
{
    public static void main( String [] args )
    {
        int maximum = 0;
        int sum = 0;
        
        System.out.println( "This program will ask you to assign a size to an array, then fill the array with values." );
        System.out.println( "The program will then calculate the average and maximum of the values you have entered." );
        
        // prompt for array size
        Scanner scanLength = new Scanner ( System.in );
        System.out.print( "Please enter an array size: " );
        int arraySize = scanLength.nextInt();
        
        // instatiate array
        int arrayOfAwesome[] = new int [arraySize];
        
        // Prompt for values until array is full
        for (int i=0; i<arrayOfAwesome.length; i++)
        {
            Scanner scanValues = new Scanner ( System.in );
            System.out.print( "Please enter a value: ");
            arrayOfAwesome[i] = scanValues.nextInt();
        }

        // Scan through values in the array
        for (int i=0; i<arrayOfAwesome.length; i++)
        {
            // Add value to an accumulator
            sum += arrayOfAwesome[i];
        
            // Check if value is the maximum
            if (arrayOfAwesome[i] > maximum)
                {
                    maximum = arrayOfAwesome[i];
                }
        }
            
        // Calculate the average of the values
        int average = sum/arrayOfAwesome.length;
        
        //Print the average and maximum
        System.out.println( "The average of the values in the array is: " + average );
        System.out.println( "The maximum of the values in the array is: " + maximum );
    }
}