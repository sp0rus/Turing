/*
     Name: John M. Stitt
     Email: jmstitt@olemiss.edu	
     Program Source File Name: TempsJMS.java
     Current Date: September 23, 2009
     Course Information: CSci 111 - Section 01
     Instructor: Ms. C. B. Zickos
     Program Description:  Program reads user input for a temperature and outputs a "probable" season based on the given temperature.
     Sources Consulted: Text book, handout
	 
     Honor Code Statement: In keeping with the honor code policies of the University of Mississippi, the School of Engineering, and the Department of Computer and Information Science, I affirm that I have neither given nor received assistance on this programming assignment. This assignment represents my individual, original effort.
                    ... My Signature is on File.
*/ 

import java.util.Scanner;

public class TempsJMSorig
{
    
    static final String A = "Summer";
    static final String B = "Spring";
    static final String C = "Fall";
    static final String D = "Winter";

    public static void main( String [] args )
    {
        
        Scanner console = new Scanner( System.in );
        System.out.print("Enter a temperature between -5 and 110 degrees fahrenheit: "); //prompt user for temperature
        int temperature = console.nextInt(); //scan and store temperature as int
        
        if (temperature >= 90 && temperature < 110 )
            System.out.println( "The temperature you gave means that the season is probably " + A);
        
        else if ( temperature >= 70 && temperature < 90)
            System.out.println( "The temperature you gave means that the season is probably " + B);
        
        else if ( temperature >= 50 && temperature < 70)
            System.out.println( "The temperature you gave means that the season is probably " + C);
        
        else if ( temperature < 50 && temperature > -5 )
            System.out.println( "The temperature you gave means that the season is probably " + D);
        
        else if ( temperature > 110 || temperature < -5 )
            System.out.println( "The temperature you gave is outside the valid range.  Try a temperature between -5 and 110 degrees next time.");
    }
}
        
        
        
        