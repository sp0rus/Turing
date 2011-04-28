/*
     Name: John M. Stitt
     Email: jmstitt@olemiss.edu	
     Program Source File Name: CircleJMS.java
     Current Date: September 16, 2009
     Course Information: CSci 111 - Section 01
     Instructor: Ms. C. B. Zickos
     Program Description: Program calculates the circumference (perimeter) of a circle using predefined constants (e.g "Pi") and a user-supplied radius.
     Sources Consulted: Text book, handout, "Digits of Pi" <"http://www.eveandersson.com/pi/digits/"> used to find value of pi to eleven decimals (then rounded to 10).
	 
     Honor Code Statement: In keeping with the honor code policies of the University of Mississippi, the School of Engineering, and the Department of Computer and Information Science, I affirm that I have neither given nor received assistance on this programming assignment. This assignment represents my individual, original effort.
                    ... My Signature is on File.
*/ 

import java.util.Scanner;

public class CircleJMS
{
     static final double PI = 3.1415926536; // constant PI rounded to the 10th decimal
	 
     public static void main( String [] args )
     {
          Scanner console = new Scanner( System.in ); // instantiates scanner object into the class with "System.in" as the data source
          System.out.print( "Enter the Radius:" ); // prompt user for radius
          double radius = console.nextDouble(); // store radius from user input
		  
          double area = Math.pow( radius, 2 )*PI; // calculate and store area of circle as a "double" data type
		  
          double perimeter = 2*PI*radius; // calculate and store perimeter of circle as a "double" data type
		  
          System.out.println( "The area of the circle with a radius of " +radius+ " is: " +area ); // display calculated area of circle
          System.out.println( "The perimeter of the circle with a radius of " +radius+ " is: " +perimeter ); // display calculated perimeter of circle
     } //end main
} //end class