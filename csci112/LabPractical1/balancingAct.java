public class balancingAct {

	public static void main(String[] args) {
		String[] testStrings = { "[{()}]",				// valid 
								 "{}()}", 				// not valid
								 "[[{}]]", 				// valid
								 "[(}]",				// not valid
								 "({})[()(){}]()", 		// valid
								 "{{[]()", 				// not valid
								 "", 					// valid
								 "}{"					// not valid
		};

	    for (int i=0; i<testStrings.length; i++) {
	    	System.out.print(testStrings[i]);
	    	if (balanced(testStrings[i])) 
	    		System.out.println(" is balanced.");
	    	else
	    		System.out.println(" is NOT balanced.");
	    }
	}

    public static boolean balanced(String s) 
    {
    	SimpleStack<Character> stk = new SimpleStack<Character>();
    	
    	for(int i=0; i<s.length(); i++)
    	{
    		char temp = s.charAt(i);
    		
    		if(temp == '[' || temp == '{' || temp == '(')
    		{
    		stk.push(temp);
    		}
    		else if(temp == ']' || temp == '}' || temp == ')')
    		{
    			if(stk.isEmpty())
    				return false;
    			else if(stk.peek() == temp)
    				return true;
    			else
    				return false;
    		}
    	}
    	
    	if(stk.isEmpty())
    		return true;
    	else
    		return false;
    }
}
