package two;
import one.A;

public class B extends A{
	void myMethod(){
		i = 1;
		j = 2;
		A a = new A();
		a.i=2;
		System.out.println("i= " + i + " j= " + j );
		
	}
public class test{
	public static void main(String[] args){
		B b = new B();
		b.myMethod();
	}
}
}
