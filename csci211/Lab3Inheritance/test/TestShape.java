package test;
    
import java.text.DecimalFormat;			//import statement to define DecimalFormat class
import shape.*;
public class TestShape {

  public static void main(String [] args) {
  	
  		//Create decimal format
  		DecimalFormat twoDecimal = new DecimalFormat("#0.00");

   		// Exactly what error message will you get with this statement?      Shape is abstract and cannot be initiated
  		//Shape s = new Shape(1,2);

      // Test the Rectangle class
      System.out.println("We'll start by testing the Rectangle class."
             + "\n\nFirst, the default constructor."
             +"\nAll variables should equal 0.");

      Rectangle r1 = new Rectangle();						//use default constructor
      System.out.println("\nTo print out information about the first rectangle we'll \ncall the toString method.");
      System.out.println("\n First rectangle\n" + r1);

			System.out.println("\nNow, the 2 argument constructor."
			 			+ "\nAfter calling the toString method you should see that \nlength=4, width=5 and all other variables equal 0.");

      Rectangle r2 = new Rectangle(4, 5);					//use 2 arg constructor
      System.out.println("\n Second rectangle\n" + r2);

			System.out.println("\nNext, the 4 argument constructor."
			 			+ "\nThe call to the toString method should reveal that \nx=10, y=20, length=200 and width=100.");
      Rectangle r3 = new Rectangle(10,20,200,100);			//use 4 arg constructor
      System.out.println("\n Third rectangle\n" + r3);

			System.out.println("\nWe'll now use the setX and setY method to change the coordinates \nof the second rectangle to x=15 and y=25.");
      r2.setX(15);			//test setX method
      r2.setY(25);			//test setY method
      System.out.println("\n Second rectangle with new coordinates\n" + r2);

			System.out.println("\nHere we'll use the setWidth and setLength to change the second \nrectangle to width=50 and length=75.");
      r2.setWidth(50);		//test setWidth method
      r2.setLength(75);		//test setLength method
    	System.out.println("\n Second rectangle with new dimensions\n" + r2);

      System.out.println("\nTesting the area and perimeter method"
             					+ "\nFor the second rectangle area= " + r2.area()+ " and perimeter= "+ r2.perimeter()
             					+ "\nAnd, for the third rectangle area= " +r3.area()+ " and perimeter= "+ r3.perimeter());


			//Test the Circle class
			System.out.println("\n\nTesting the Circle class."
								+ "\n\nFirst, the default constructor."
             					+"\nAll variables should equal 0.");
			
      Circle c1 = new Circle();				//use default constructor
      System.out.println("\nTo print out information about the first circle we'll \ncall the toString method.");
      System.out.println("\n First circle\n" + c1);

      System.out.println("\nNow, the 1 argument constructor."
					+ "\nAfter calling the toString method you should see that \nradius=6 and all other variables equal 0.");

			Circle c2 = new Circle(6);					//use 1 arg constructor
      System.out.println("\n Second circle\n" + c2);

      System.out.println("\nNext, the 3 argument constructor."
						+ "\nThe call to the toString method should reveal that \nx=11, y=22, radius=10.");
			Circle c3 = new Circle(11,22,10);			//use 4 arg constructor
      System.out.println("\n Third circle\n" + c3);

      System.out.println("\nWe'll now use the setX and setY method to change the coordinates \nof the second circle to x=10 and y=7.");
			c2.setX(10);			//test setX method
			c2.setY(7);			//test setY method
      System.out.println("\n Second circle with new coordinates\n" + c2);

      System.out.println("\nHere we'll use the setRadius to change the second \ncircle to radius=30.");
			c2.setRadius(30);		//test setRadius method
			System.out.println("\n Second circle with new dimensions\n" + c2);

			System.out.println("\nTesting the area and perimeter method"
			             		+ "\nFor the second circle area= " + twoDecimal.format(c2.area())+ " and perimeter= "+ twoDecimal.format(c2.perimeter())
             					+ "\nAnd, for the third circle area= " +twoDecimal.format(c3.area())+ " and perimeter= "+ twoDecimal.format(c3.perimeter()));


//      //Test the Triangle class
//       System.out.println("\n\nTesting the Triangle class."
//							+ "\n\nFirst, the default constructor."
//			        +"\nAll variables should equal 0.");
//
//			Triangle t1 = new Triangle();				//use default constructor
//			System.out.println("\nTo print out information about the first triangle we'll \ncall the toString method.");
//            System.out.println("\n First triangle\n" + t1);
//
//			System.out.println("\nNow, the 3 argument constructor."
//									 	    + "\nAfter calling the toString method you should see that \nside 1=3, side 2=4,"
//									 	    + "\n side 3=5 and all other variables equal 0.");
//
//			Triangle t2 = new Triangle(3,4,5);					//use 3 arg constructor
//			System.out.println("\n Second triangle\n" + t2);
//
//			System.out.println("\nNext, the 5 argument constructor."
//								+ "\nThe call to the toString method should reveal that \nx=2, y=7, side 1=12, side 2=16, and side 3=24 .");
//			Triangle t3 = new Triangle(2,7,12,16,24);			//use 5 arg constructor
//            System.out.println("\n Third triangle\n" + t3);
//
//			System.out.println("\nWe'll now use the setX and setY method to change the coordinates \nof the second triangle to x=4 and y=8.");
//						t2.setX(4);			//test setX method
//						t2.setY(8);			//test setY method
//			System.out.println("\n Second triangle with new coordinates\n" + t2);
//
//			System.out.println("\nHere we'll use the setSide1-3 to change the third \ntriangle to side 1=7, side 2=13, and side 3 = 18.");
//						t3.setSide1(7);			//test setSide1 method
//						t3.setSide2(13);		//test setSide2 method
//						t3.setSide3(18);		//test setSide3 method
//			System.out.println("\n Third circle with new dimensions\n" + t3);
//
//			System.out.println("\nTesting the area and perimeter method"
//						             		+ "\nFor the second triangle area= " + twoDecimal.format(t2.area())+ " and perimeter= "+ t2.perimeter()
//			             					+ "\nAnd, for the third triangle area= " +twoDecimal.format(t3.area())+ " and perimeter= "+ t3.perimeter());





      }
}

