//********************************************************************
//  MorphingDogs       Java Foundations
//
//  An example of Dynamic Binding using polymorphism
//********************************************************************
import java.util.Scanner;

public class MorphingDogs
{
   public static void main(String[] args) 
   {
      Dog myDog; //What type must dog be declared as so it can be any type of dog?
      String ans = "y";
      int choice;
      Scanner scan = new Scanner(System.in);

      while(ans.equalsIgnoreCase("y"))
      {
         System.out.println("Choose a Breed:\n1. Labrador\n2. Yorkshire");
         choice = scan.nextInt();

         //The compiler cannot know at compile time what type myDog will be. 
         //It is determined at run time every time the while loop is executed.

         if(choice == 1)
            myDog = new Labrador("Goldie","Yellow");
         else
            myDog = new Yorkshire("Bruce");

         System.out.println(myDog.speak());

         System.out.print("Try again? ");
         ans = scan.next();
      }
   }
}
