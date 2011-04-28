/*
     Name: John M. Stitt
     Email: jmstitt@olemiss.edu
     Program Source File Name: Palindrome.java
     Current Date: April 29, 2010
     Course Information: CSci 112
     Instructor: Dr. Wilkins
     Program Description: Program test whether or not the given string is a palindrome using stacks
     Sources Consulted: Textbook, internet site on regex for punctuation removal
    
     Honor Code Statement: In keeping with the honor code policies of the University of Mississippi, the School of Engineering, and the Department of Computer and Information Science, I affirm that I have neither given nor received assistance on this      programming assignment. This assignment represents my individual, original effort.
*/ 


public class Palindrome {

	public static void main(String[] args) {
		String[] data = {"madam", "java", "madam i'm adam", 
				"red rum, sir, is murder", "no way, jose",
				"never odd or even"};
		
		for (int i=0; i<data.length; i++) {
			System.out.printf("'%s'", data[i]);
			if (isPalindrome(data[i])) 
				System.out.println("   IS a palindrome.");
			else
				System.out.println("   is NOT a palindrome");
			System.out.println();
		}
	}
	public static String removeCharAt(String s, int pos) 
	{
		return s.substring(0,pos)+s.substring(pos+1);
	}
	
	public static boolean isPalindrome(String pal)
	{
		SimpleStack<Character> stk = new SimpleStack<Character>();
    	
		String noPunctuation = pal.replaceAll("\\p{Punct}+", "");
		String noSpaces = noPunctuation.replaceAll(" ", "");
		
		if(noSpaces.length()%2!=0)
		{
			String testString = removeCharAt(noSpaces, noSpaces.length()/2);
			
			int halfString=testString.length()/2;
			int count=0;
			
			for(int i=0; i<halfString; i++)
			{
				char temp = testString.charAt(i);
				
				stk.push(temp);
			}
			
				for(int i=0; i<halfString; i++)
				{
					char compareStack=stk.pop();
					char compareString=testString.charAt(halfString+i);
					
					if(compareStack==compareString)
						count++;
					else
						return false;
				}

			if(count==halfString)
				return true;
			else
				return false;
		}
		else
		{
			String testString = noSpaces;
			
			int halfString=testString.length()/2;
			int count=0;
			
			System.out.println(testString);
			
			for(int i=0; i<halfString; i++)
			{
				char temp = testString.charAt(i);
				
				stk.push(temp);
			}
			
				for(int i=0; i<halfString; i++)
				{
					char compareStack=stk.pop();
					char compareString=testString.charAt(halfString+i);
					
					if(compareStack==compareString)
						count++;
					else
						return false;
				}

			if(count==halfString)
				return true;
			else
				return false;
		}
		
		
    }
}
