import java.util.*;
public class Student {

	String name;
	int age;
	/**
	 * @param args
	 */
	public Student(String name,int age)
	{
		this.name =name;
		this.age=age;
	}
//	public int hashCode(){
//		return 1;
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long t1,t2;
		Student s1=new Student("Shreyas",22);
		Student s2=new Student("bradley",18);
		Student s3=new Student("robert",24);
		Student s4=new Student("andrew",18);
		Student s5=new Student("philip",25);
		Student s6=new Student("bob", 25);
		
		//System.out.println(s1.equals(s2));
		HashSet<Student> col=new HashSet<Student>(4);
		col.add(s1);
		col.add(s2);
		col.add(s3);
		col.add(s4);
		col.add(s5);
		System.out.println(col);
		col.add(s6);
		//System.out.println(s1);
		
		Iterator<Student> iterator = col.iterator();
	       
	    while(iterator.hasNext()){        
	        System.out.println(iterator.next());
	    }
			
		
		
	}

}