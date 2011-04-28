import edu.olemiss.cs211.a1.*;


public class a1 {

	
	public static void main(String args[]){
		
		a1 a = new a1();
	}
	
	public a1(){
		
		List<Integer> list1 = new List<Integer>();
		
		list1.add(new Integer(5));
		list1.add(new Integer(3));
		list1.add(new Integer(6));
		list1.add(new Integer(4));
		
		System.out.println(list1);
		System.out.println();

		Stack<Integer> list2 = new Stack<Integer>();
		
		list2.push(new Integer(5));
		list2.push(new Integer(3));
		list2.push(new Integer(6));
		list2.push(new Integer(4));
		
		System.out.println(list2);
		System.out.println();
		System.out.println("pop(): " + list2.pop());
		System.out.println("pop(): " + list2.pop());
		System.out.println("pop(): " + list2.pop());
		System.out.println("pop(): " + list2.pop());

		System.out.println();
		
		OrderedList<Integer> list3 = new OrderedList<Integer>();
		
		list3.add(new Integer(5));
		list3.add(new Integer(3));
		list3.add(new Integer(6));
		list3.add(new Integer(4));
		
		System.out.println(list3);
		System.out.println();

// These next four lines shouldn't compile.	
//
//		list1.add(new Float(10.0));
//		list2.add(new Float(10.0));
//		list3.add(new Float(10.0));		
//		
//		OrderedList<Object> list4 = new OrderedList<Object>();
		
	}
	
	
}
