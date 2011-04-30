/****************************************************
* NAME: John Stitt jmstitt@olemiss.edu
* EXERCISE NUMBER: 1
* PROGRAM TITLE/TOPIC: Case Changing
* COURSE INFORMATION: CSCI 112; Summer 2010
* INSTRUCTOR: James Church (jcchurch@olemiss.edu)
* CURRENT DATE: 7/2/2010
*
* HONOR CODE STATEMENT:
* In keeping with the Honor Code policies of the University of
* Mississippi, the School of Engineering, and the Department of
* Computer and Information Science, I affirm that I have neither
* given nor received assistance on this programming exercise.
*
* PROGRAM DESCRIPTION:
* Program asks for user input of a sentence.  Then the program takes the sentence and changed the case of all characters.
****************************************************/


import java.lang.Character;
import java.util.*;

class CaseChange
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner (System.in);
        
        System.out.println ( "Enter a sentence to have the case changed: " );
        String input = scan.nextLine();
        
        System.out.println();
        System.out.println( "The sentence with the case reversed is: ");
       
        for(int i=0; i<input.length(); i++)
        {
        	char ch = input.charAt(i);
        
        	if( 'a' <= ch && ch <= 'z')
        	{
        		ch = Character.toUpperCase(ch);
        	}
        	else if( 'A' <= ch && ch <= 'Z')
        	{
        		ch = Character.toLowerCase(ch);
        	}
        	
        	System.out.print(ch);
        }
    }
}