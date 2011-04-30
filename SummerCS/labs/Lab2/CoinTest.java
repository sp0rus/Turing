import java.util.Random;

public class CoinTest {
	public static void main( String[] args ){
		MonetaryCoin[] coins = new MonetaryCoin[5];
		int sum = 0;
		int[] values = {1, 5, 10, 25};
		
		Random rng = new Random();
		
		for(int i =0; i < coins.length; i++){
			int randomValue = rng.nextInt(4);
			coins[i] = new MonetaryCoin(values[randomValue]);
		}
		for(int i =0; i < coins.length; i++){
			sum += coins[i].getValue();
		}
		System.out.println("The sum of the coins is: " + sum);
		for(int i =0; i < coins.length; i++){
			coins[i].flip();
			System.out.println(coins[i]);
		}
	}
}
