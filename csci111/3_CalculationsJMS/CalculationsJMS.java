/*
     Name: John M. Stitt
     Email: jmstitt@olemiss.edu
     Program Source File Name: CalculationsJMS.java
     Current Date: September 9, 2009
     Course Information: CSci 111 - Section 01
     Instructor: Ms. C. B. Zickos
     Program Description: Program performs the calculations it has been programmed for, and outputs text with the output of the calculation and a description of what the number is.
     Sources Consulted: Textbook, Program handout
    
     Honor Code Statement: In keeping with the honor code policies of the University of Mississippi, the School of Engineering, and the Department of Computer and Information Science, I affirm that I have neither given nor received assistance on this programming assignment. This assignment represents my individual, original effort.
                    ... My Signature is on File.
*/ 

public class CalculationsJMS
{
     static final double MILLIMETERS_IN_AN_INCH = 25.4;  // constant of how many millimeters are in a single inch
     static final double KILOGRAMS_IN_A_POUND = .454; // constant of how many kilograms are in a single pound
     
     public static void main (String [] args)
     {
     System.out.println("The square of the integer 1 is " + (1*1));
     System.out.println("The square of the integer 2 is " + (2*2));
     System.out.println("The square of the integer 3 is " + (3*3));

     int sum = 1+3+9;
     System.out.println("The sum of the integers 1, 3 and 9 is " + sum);
		
     double average = sum/3.0;
     System.out.println("The average of the integers 1, 3 and 9 is " + average);
		
     System.out.println("The equivalent of 15 inches in millimeters is " + (15*MILLIMETERS_IN_AN_INCH));
		
     System.out.println("The equivalent of 20 pounds in kilograms is " + (20*KILOGRAMS_IN_A_POUND));
     }
}	
		