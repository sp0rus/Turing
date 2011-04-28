/*
     Name: John M. Stitt
     Email: jmstitt@olemiss.edu	
     Program Source File Name: ArrayProcessorJMS.java
     Current Date: 11/18/09
     Course Information: CSci 111 - Section 01
     Instructor: Ms. C. B. Zickos
     Program Description: Class instantiates array of size 5, set elements to user specified values, and calculates the sum of the values, then prints the sum.
     Sources Consulted: book, handout
    
     Honor Code Statement: In keeping with the honor code policies of the University of Mississippi, the School of Engineering, and the Department of Computer and Information Science, I affirm that I have neither given nor received assistance on this programming assignment. This assignment represents my individual, original effort.
                    ... My Signature is on File.
*/ 

import java.util.Scanner;
import java.io.*;

public class ArrayProcessorJMS
{
    public static void main ( String [] args ) throws FileNotFoundException
    {
        Scanner scan = new Scanner(new File("numbers.txt")); 
        int intArray [] = new int [scan.nextInt()];
        
        int countOfNumbers;
        int sumOfNumbers;
        int average;
        
    }
}
