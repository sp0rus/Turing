package shape;

public class SuperClass {
	int i;
}
class UseStatic extends SuperClass{
	static int a = 3;
	static int b;
	// static int i;
	public void meth(int x){
		System.out.println("x = " +x);

		System.out.println("a = " +a);
		System.out.println("b = " +b);
	}
	public static void main(String args[]){
		meth(42);
	}
}
