/*
 Driver/client program to test the box class.
 For Programming Project 5.6 in the text:
 
 Design and implement a class called "Box" that contains instance
 data that represents the height, width, and depth of the box.
 Also include a boolean variable called "full" as instance data
 that represents if the box is full or not.  Define the Box
 constructor to accept and initialize the height, width and
 depth of the box.  Each newly created Box is empty (the 
 constructor should initialize "full" to false).  Include getter
 and setter methods for all instance data.  Include a toString
 method that returns a one-line description of the box.  Create
 a driver class called BoxTest, whose main method instantiates
 and updates several Box objects. 
 */

public class BoxTest {

	public static void main(String[] args) {
		
		// Hard-code some data for testing
		// Height, width, depth values, respectively for each box
		double[][] boxSizes = { 
				{3.2, 4.1, 5.0},
				{1.5, 1.5, 1.5},
				{4.0, 5.0, 6.0},
				{2.4, 3.4, 4.4},
				{8.3, 4.6, 3.7}
		};
		
		// An array of boxes, sized for the data above
		Box[] boxes = new Box[boxSizes.length];
		
		// Construct the box objects, check toString method
		for (int i=0; i<boxSizes.length; i++) {
			boxes[i] = new Box(boxSizes[i][0], 
					           boxSizes[i][1],
					           boxSizes[i][2]);
			System.out.println("Created box " + i + ": " +
					boxes[i]);
		}
		
		// Test getters
		System.out.println();
		System.out.println("Box 3 dimensions: " +
				boxes[3].getHeight() + " by " +
				boxes[3].getWidth()  + " by " +
				boxes[3].getDepth());
		
		// Test setters
		System.out.println("Changing dimensions of box 3.");
		boxes[3].setHeight(4.5);
		boxes[3].setWidth(5.5);
		boxes[3].setDepth(3.5);
		boxes[0].setFull(true);
		boxes[2].setFull(true);
		System.out.println("Box 3 dimensions: " +
				boxes[3].getHeight() + " by " +
				boxes[3].getWidth()  + " by " +
				boxes[3].getDepth());
		System.out.println();
		
		// Test getVolume method
        for (int i=0; i<boxes.length; i++) {
           	System.out.printf("Box %d: %s and has volume %8.3f\n",
        			i, boxes[i], boxes[i].getVolume());
        }
        
        System.out.printf("\nThe total volume of all boxes is %10.3f\n",
        		totalVolume(boxes));
        
        System.out.printf("%d of the %d boxes are full\n", 
        		countFull(boxes), boxes.length);
        
        System.out.printf("\nThere are %d boxes larger than %6.1f\n",
        		countBig(boxes, 100), 100.0);
        System.out.printf("There are %d boxes larger than %6.1f\n",
        		countBig(boxes, 5.555), 5.555);        
        System.out.printf("There are %d boxes larger than %6.1f\n",
        		countBig(boxes, 65.6), 65.6);
	}
	
	// TODO: Return total volume of all boxes
	public static double totalVolume(Box[] b) {
		return 0;
	}

	// TODO: Return count of number of boxes with volume greater than 'size'
	public static int countBig(Box[] b, double size) {
		return 0;
	}
	
	// TODO: Count the number of boxes that are full
	public static int countFull(Box[] b) {
		return 0;
	}
}
