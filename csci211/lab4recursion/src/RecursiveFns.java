
public class RecursiveFns {
	public static void main(String[] args) {
		int a = 4;
		int b = 9;
		int c = -42;
		//test fact method
		System.out.println("Factorial of " + a + " is " + fact(a));
		System.out.println("Factorial of " + b + " is " + fact(b));
		System.out.println("Factorial of " + c + " is " + fact(c));
		
		int d = 14;
		int e = 16;
		//test natToBin method
		System.out.println("Binary of " + d + " is " + natToBin(d));
		System.out.println("Binary of " + e + " is " + natToBin(e));
	}
	static int fact(int n){
		if(n < 0){
			System.out.println("Please input a number greater than zero." + "  " + n + " is not a valid number." );;
			return 0;
		}
		if(n==0){
			return 1;
		}
		else
			return n*fact(n-1);
	}
	static String natToBin(int n){
		String answer = "";
		if( n == 0 ){
			answer = "0" + answer;
		}
		else if( n == 1 ){
			answer = "1" + answer;
		}
		else{
			answer = natToBin(n/2) + n%2;
		}
		return answer;
	}
}
