/*
     Name: John M. Stitt
     Email: jmstitt@olemiss.edu	
     Program Source File Name: ArrayPractice.java
     Current Date: 11/18/09
     Course Information: CSci 111 - Section 01
     Instructor: Ms. C. B. Zickos
     Program Description: Class instantiates array of size 5, set elements to user specified values, and calculates the sum of the values, then prints the sum.

     Honor Code Statement: In keeping with the honor code policies of the University of Mississippi, the School of Engineering, and the Department of Computer and Information Science, I affirm that I have neither given nor received assistance on this programming assignment. This assignment represents my individual, original effort.
                    ... My Signature is on File.
*/ 

import java.util.Scanner;

public class ArrayPractice
{
    public static void main( String [] args )
    {
        Scanner scan = new Scanner( System.in );
        int intArray [] = new int [5];
        
        System.out.print( "Enter a whole number value to be added: ");
        intArray[0] = scan.nextInt();
        
        for (int i = 1; i < intArray.length; i++)
        {
            System.out.print( "Enter the next whole number value to be added: ");
            intArray[i] = scan.nextInt();
        }
        
        int sumOfArray = 0;
        for (int i = 0; i  < intArray.length; i++)
        {
            sumOfArray += intArray[i];
        }
        
        double averageOfArray = (double)sumOfArray/intArray.length;
        System.out.println( "The sum of the values entered is: " + sumOfArray );
        System.out.println( "The average of the values entered is: " + averageOfArray );
    }
}
