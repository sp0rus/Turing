// ****************************************************************
// PersonDriver.java
//
// A class to test .equals method in Person
//          
// ****************************************************************
public class PersonDriver
{
    public static void main (String[] args) {
        Person bob1 = new Person("Bob", "Smith", 34);
        Person bob2 = new Person("Bob", "Jones", 34);
        Person bob3 = new Person("Bob", "Smith", 21);      
        Person bob4 = new Person("Bob", "Smith", 34);
        Person bob5 = new Person("B", "Smith", 34);

        checkEquals(bob1, bob2);
        checkEquals(bob1, bob3);
        checkEquals(bob1, bob4);
        checkEquals(bob1, bob5);
        checkEquals(bob2, bob2);
        checkEquals(bob4, bob5);
    }

    public static void checkEquals (Person p1, Person p2) {
	if (p1.equals(p2)) {
            System.out.printf("EQUAL: %s %s %d\n", 
			      p1.getFirstName(), p1.getLastName(), p1.getAge());
        }
        else {
            System.out.printf("%s %s %d NOT EQUAL %s %s %d\n",
			      p1.getFirstName(), p1.getLastName(), p1.getAge(),
			      p2.getFirstName(), p2.getLastName(), p2.getAge());
        }
    } 
}

