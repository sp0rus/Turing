import java.util.*;

public class Frequency {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner( System.in );
		Scanner scanChar = new Scanner( System.in );
		
		int[] frequency_table = new int[51];
		
		int input = 0;
		do {
			do{
				System.out.print("Enter a value from 0 to 50 (or -1 to stop): ");
				input = scan.nextInt();
			
				if( 0 <= input && input <= 50 ) {
					frequency_table[input]++;
				}
				else if ( input <= -2 || input >= 51 ) {
					System.out.println( "The number " + input + " is outside the acceptable range");
				}
			}while( input != -1);
			System.out.println();
			System.out.println("Here is the tally for each number.");
			for( int i = 0; i <= 50; i++ ) {
				if( frequency_table[i] != 0 ) {
					System.out.println( i + ": " + frequency_table[i] );
				}
			}
			System.out.println();
			System.out.print("Do you want to do this again (y/n)? ");
		}while(scanChar.next().charAt(0) == 'y');
	}

}
