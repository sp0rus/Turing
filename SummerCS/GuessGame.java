import java.util.*;

public class GuessGame {
	public static void main( String[] args ){
		Scanner scan = new Scanner( System.in );
		Random rng = new Random();
	
		int secret = rng.nextInt(100) + 1;
		int guess = -1;
		int numGuesses = 0;
		while( guess != secret ){
			System.out.print( "Enter a number from 1 to 100: ");
			guess = scan.nextInt();
			numGuesses++;
		
			if( guess < secret ){
				System.out.println( "Too low!" );
			}
			else if( guess > secret ){
				System.out.println( "Too high!" );
			}
		}
		System.out.println( "Congratulations! You Found it in " + numGuesses + " guesses!");
	}
}
