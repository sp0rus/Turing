/*
     Name: John Stitt
     Email: jmstitt@olemiss.edu
     Program Source File Name: fig03_16.cpp
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

// Fig. 3.17: fig03_16.cpp
// Create and manipulate a GradeBook object; illustrate validation.
#include <iostream>
#include "GradeBook.h" // include definition of class GradeBook
using namespace std;

// function main begins program execution
int main()
{
   // create two GradeBook objects; 
   // initial course name of gradeBook1 is too long
   GradeBook gradeBook1( "CS101 Introduction to Programming in C++", "Bradley Balducci" );
   GradeBook gradeBook2( "CS102 C++ Data Structures", "Alan Thigpen" );

   // display each GradeBook's courseName 
   cout << "gradeBook1's initial course name is: " 
      << gradeBook1.getCourseName()
		<< " and the instructor's name is: "
		<< gradeBook1.getInstructorName()
      << "\ngradeBook2's initial course name is: " 
      << gradeBook2.getCourseName() 
		<< " and the instructor's name is: "
      << gradeBook2.getInstructorName()
		<< endl;

   // modify myGradeBook's courseName (with a valid-length string)
   gradeBook1.setCourseName( "CS101 C++ Programming" );

   // display each GradeBook's courseName 
   cout << "\ngradeBook1's course name is: " 
      << gradeBook1.getCourseName()
		<< " and the instructor's name is: "
      << gradeBook1.getInstructorName()

      << "\ngradeBook2's course name is: " 
      << gradeBook2.getCourseName() 
		<< " and the instructor's name is: "
      << gradeBook2.getInstructorName()
		<< endl;
} // end main



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

