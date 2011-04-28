import java.util.Scanner;

public class HiLo 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		final int MAX = 100;
		int target, guess;
		String again;
		
		Scanner scan = new Scanner(System.in);
		
		do
		{
			int count = 0;
			
			System.out.println();
			System.out.println( "Guess a number between 1 and " + MAX );
			
			target = (int) ( Math.random()* MAX ) + 1;
			
			do
			{
				System.out.println();
				System.out.print( "Enter your guess (0 to quit): " );
				guess = Integer.parseInt(scan.nextLine());
				count = count + 1;
				
				if ( guess > 0 )
					if ( guess == target )
						System.out.println( "Right! Guesses: " + count );
					else
						if ( guess < target )
							System.out.println( "Your guess was too LOW." );
						else
							System.out.println( "Your guess was too HIGH." );
			} while (guess != target && guess > 0 );
			
			System.out.println();
			System.out.print( "Play again (y/n)?: ");
			again = scan.nextLine();

		} while ( again.equalsIgnoreCase("y"));
		
		System.out.println( "Thanks for Playing!" );
	}
}
