

public class Counter {
	private int result=0;
	static private int var=10;
	public int getResult() {
		return result; 
	}

	public void count() {
		for (int i = 0; i < 100; i++) {//			breakpoint at this line of code
			result += i +1; 
		}
	}


}
