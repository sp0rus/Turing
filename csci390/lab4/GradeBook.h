/*
     Name: John Stitt
     Email: jmstitt@olemiss.edu
     Program Source File Name: GradeBook.h
     Current Date: 2/8/2011
     Course Information: CSci 390 - Section 01
     Instructor: Ms. C. B. Zickos
     Program Description:
     Sources Consulted: Book and source code provided on Ms Zickos' webpage

     Honor Code Statement: In keeping with the honor code policies of the University of Mississippi, the School of Engineering,      and the
Department of Computer and Information Science, I affirm that I have neither given nor received assistance on this      programming assignment. This
assignment represents my individual, original effort.
                    ... My Signature is on File.
*/

// Fig. 3.15: GradeBook.h
// GradeBook class definition presents the public interface of  
// the class. Member-function definitions appear in GradeBook.cpp.
#include <string> // program uses C++ standard string class
using namespace std;

// GradeBook class definition
class GradeBook
{
public:
   GradeBook( string, string ); // constructor that initializes a GradeBook object
   void setCourseName( string ); // function that sets the course name
   string getCourseName(); // function that gets the course name
	void setInstructorName( string );
	string getInstructorName();
   void displayMessage(); // function that displays a welcome message
private:
   string courseName; // course name for this GradeBook
	string instructorName;
}; // end class GradeBook  


/**************************************************************************
 * (C) Copyright 1992-2010 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 **************************************************************************/ 
