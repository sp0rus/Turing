// ****************************************************************
// DogTest.java
//
// A simple test class that creates a Dog and makes it speak.
//          
// ****************************************************************

public class DogTest
{
   public static void main(String[] args)
   {
      Dog dog = new Dog("Spike");
      System.out.println(dog.getName() + " says " + dog.speak());
      
      Dog labrador1 = new Labrador("Goldie", "yellow");
      System.out.println(labrador1.getName() + " is a " + ((Labrador)labrador1).getColor() + " lab who weighs around " + Labrador.avgBreedWeight() + " lbs. and says " + labrador1.speak());
      
      Dog yorkshire1 = new Yorkshire ("Bruce");
      System.out.println(yorkshire1.getName() + " is a yorkie who weighs around " + Yorkshire.avgBreedWeight() + " lbs. and says "+ yorkshire1.speak());
      
   }
}
 
