// ****************************************************************
// Person.java
//
// A class that represents a person.
//          
// ****************************************************************
public class Person
{
   private String firstName;
   private String lastName;
   private int age;

   public Person (String newFirstName, String newLastName, int newAge)
   {
      firstName = newFirstName;
      lastName = newLastName;
      age = newAge;
   }
   
   public String getFirstName() 
   {
       return firstName;
   }
   
   public String getLastName() 
   {
       return lastName;
   }
   
   public int getAge() 
   {
       return age;
   }
   public boolean equals (Person pn)
   {
	   if (this.getFirstName() == pn.getFirstName())
	   {
		   if (this.getLastName() == pn.getLastName())
		   {
			   if (this.getAge() == pn.getAge())
			   {
				   return true;
			   }
			   else
			   {
				   return false;
			   }
		   }
		   else
		   {
			   return false;
		   }
	   }
	   else
	   {
		   return false;
	   }
   }
}
