/*
     Name: John Stitt
     Email: jmstitt@olemiss.edu
     Program Source File Name: gradebook.cpp
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

// Fig. 3.16: GradeBook.cpp
// Implementations of the GradeBook member-function definitions.
// The setCourseName function performs validation.
#include <iostream>
#include "GradeBook.h" // include definition of class GradeBook
using namespace std;

// constructor initializes courseName with string supplied as argument
GradeBook::GradeBook( string name, string instName )
{
   setCourseName( name ); // validate and store courseName
	setInstructorName( instName );
} // end GradeBook constructor

// function that sets the course name;
// ensures that the course name has at most 25 characters
void GradeBook::setCourseName( string name )
{
   if ( name.length() <= 25 ) // if name has 25 or fewer characters
      courseName = name; // store the course name in the object

   if ( name.length() > 25 ) // if name has more than 25 characters
   { 
      // set courseName to first 25 characters of parameter name
      courseName = name.substr( 0, 25 ); // start at 0, length of 25

      cout << "Name \"" << name << "\" exceeds maximum length (25).\n"
         << "Limiting courseName to first 25 characters.\n" << endl;
   } // end if
} // end function setCourseName

// function to get the course name
string GradeBook::getCourseName()
{
   return courseName; // return object's courseName
} // end function getCourseName

// display a welcome message to the GradeBook user

void GradeBook::setInstructorName( string name )
{
   if ( name.length() <= 25 ) // if name has 25 or fewer characters
      instructorName = name; // store the course name in the object

   if ( name.length() > 25 ) // if name has more than 25 characters
   {
      // set instructorName to first 25 characters of parameter name
      instructorName = name.substr( 0, 25 ); // start at 0, length of 25

      cout << "Name \"" << name << "\" exceeds maximum length (25).\n"
         << "Limiting Instructor Name to first 25 characters.\n" << endl;
   } // end if
}

// function to get the instructor name
string GradeBook::getInstructorName()
{
   return instructorName;
}

void GradeBook::displayMessage()
{
   // call getCourseName to get the courseName
   cout << "Welcome to the grade book for\n" << getCourseName()  
      << "!" << endl;
	cout << "This course is presented by: \n" << getInstructorName()
		<< endl;
} // end function displayMessage


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
