import java.util.*;

public class RPN {

    public static void main(String[] args) {

        Stack s = new Stack();
        Scanner scan = new Scanner(System.in);
        boolean goodness = true;
        
    	System.out.print( "Enter the formula: ");
        while(true){
        	String token = scan.next();
        	
        	
        	if( token.equals("GO")){
        		break;
        	}
        	
        	int n;
        	try{
        		n = Integer.parseInt(token);
        		s.push(n);
        	}
        	catch( NumberFormatException e ){
        		if( s.size() < 2 ){
        			goodness = false;
        			System.out.println( "Error, you didn't tell me enough to do anything." );
        			break;
        		}
        		else{
        			int b = s.pop();
        			int a = s.pop();
        			int c = 0;
        			if(token.equals("+")){
        				c = (a+b);
        				s.push(c);
        			}
        			if(token.equals("-")){
        				c = (a-b);
        				s.push(c);
        			}
        			if(token.equals("*")){
        				c = (a*b);
        				s.push(c);
        			}
        			if(token.equals("/")){
        				try{
        				c = (a/b);
        				s.push(c);
        				}
        				catch(ArithmeticException f){
        					System.out.println( "Ouch. That hurts. Trying to make me do things that are impossible. Stop it. " );
        					System.out.println( f );
        				}
        			}
        			else{
        				System.out.println( "Somebody's trying to be funny and not give me math symbols. Don't do that." );
        			}
        		}
        	}
        }
        if(goodness){
        	if( s.size() == 1){
    			System.out.println( "Answer: " + s.peek() );
    		}
    		else{
    			System.out.println( "Something went wrong" );
    		}
        }
        else{
        	System.out.println( "Something went wrong" );
    	}
    }
}