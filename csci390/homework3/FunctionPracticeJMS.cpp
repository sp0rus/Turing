/*
     Name: John Stitt
     Email: jmstitt@olemiss.edu
     Program Source File Name: FunctionPracticeJMS.cpp
     Current Date: 3/10/2011
     Course Information: CSci 390 - Section 01
     Instructor: Ms. C. B. Zickos
     Program Description: The program contains functions for a list of tasks.
     Sources Consulted:

     Honor Code Statement: In keeping with the honor code policies of the University of Mississippi, the School of Engineering,      and the Department of Computer and Information Science, I affirm that I have neither given nor received assistance on this      programming assignment. This assignment represents my individual, original effort.
                    ... My Signature is on File.
*/

#include <iostream>

using namespace std;

int echo();
int findMin();
string letterGrade(int);
int flip();
bool isEquals(int, int);
bool isEquals(double, double, double);
int countOdd();
string greetUser(string, string);
string makeUsername(string, string, string);
int pow(int, int);
int factorial(int);

// Function: Main
// Purpose: Calls the other functions in the program in order to test them.
int main()
{
        cout << "Testing function 'echo'..." << endl;
        int sum = echo();
        cout << "The sum of the values is " << sum << endl;

        cout << "Testing function 'findMin'..." << endl;
	int min = findMin();
        cout << "The minimum of the values is " << min << endl;
        
        cout << "Testing function 'letterGrade'..." << endl;
        int grade = 500;
        cout << "Enter your grade: ";
        cin >> grade;
        string lettergrade = letterGrade(grade);
        cout << "Your letter grade is: " << lettergrade << endl;
        
        cout << "Testing function 'flip'..." << endl;
        
        cout << "Testing function 'isEquals' with two parameters..." << endl;
        
        cout << "Testing function 'isEquals' with three parameters..." << endl;
        
        cout << "Testing function 'countOdd'..." << endl;
        
        cout << "Testing function 'greetUser'..." << endl;
        
        cout << "Testing function 'makeUsername'..." << endl;
        
        cout << "Testing function 'pow'..." << endl;
        
        cout << "Testing function 'factorial'..." << endl;
        
        cout << "All tests completed.";
}

// Function: echo
/* Purpose: Interactively reads a series of positive integers and returns the 
   sum of the values.  Allows the user to enter as many values as they want, 
   signaling that they are done by entering -1. 
*/
int echo()
{
        int sentinel = -1;
        int current = 0;
        int sum = 0;
        int numcurrent = 1;
        cout << "Enter a series of integers, when you're done, enter -1.";

        while (current != sentinel)
        {
                cout << "Enter number " << numcurrent << ": ";
                cin >> current;
                if(current != sentinel)
                {
                        sum += current;
                        numcurrent++;
                }
        }
        return sum;
}

// Function: findMin
/* Purpose: Interactively reads a series of positive integers per the requirements
   in function "echo" and returns the minimum value read.
*/
int findMin()
{
	int sentinel = -1;
        int current = 0;
        int min = 0;
        int numcurrent = 1;
        cout << "Enter a series of integers, when you're done, enter -1.";

        while (current != sentinel)
        {
                cout << "Enter number " << numcurrent << ": ";
                cin >> current;
                if(numcurrent == 1)
                {
                        min = current;
                }
		if(current <= min && current != sentinel)
		{
			min = current;
		}
		numcurrent++;
        }
        return min;
}

// Function: letterGrade
/* Purpose: Takes an integer value representing a student's test score and uses a 
   switch statement to assign and return an appropriate letter grade using the
   grading scale of this class (i.e. return a value of "A" if the score is within
   the range of 90 to 100, "B" if the score is between 80 and 89, etc. If the score
   is out of range, prints "?".
*/
string letterGrade(int grade)
{
        string letter = "x";
	switch (grade/10)
	{
                case 10 :
                        
                case 9 :
                        letter = "A";
                        break;
                case 8 :
                        letter = "B";
                        break;
                case 7 :
                        letter = "C";
                        break;                        
                case 6 :
                        letter = "D";
                        break;
                case 5 :
                        letter = "F";
                        break;
                case 4 :
                        letter = "F";
                        break;
                case 3 :
                        letter = "F";
                        break;
                case 2 :
                        letter = "F";
                        break;
                case 1 :
                        letter = "F";
                        break;
                case 0 :
                        letter = "F";
                        break;                                                
                default :
                        letter = "?";
        }
        return letter;
}

// Function: flip
/* Purpose: Takes no arguments and pseudorandomly returns either a 0 or a 1.
*/
int flip()
{

}

// Function: isEquals
/* Purpose: Takes two integer parameters and will return true if they are equal and
   false if they are not equal.
*/
bool isEquals(int a, int b)
{

}

//Function: isEquals
/* Purpose: Takes three double parameters and will return true if the values of the 
   first two parameters are equal and false if they are not equal, where they will 
   be considered equal if they are no more than the value of the third parameter apart. 
*/
bool isEquals(double a, double b, double c)
{

}

//Function: countOdd
/* Purpose: Interactively read a series of positive integers per the requirements 
   in function #1 and return the count of the values that were odd.
*/
int countOdd()
{

}

// Function: greetUser
/* Purpose: Takes two parameters representing a person's first and last name and 
   will return a string consisting of the phrase "Welcome " followed by the first 
   name and last name with a space between the two. 
*/
string greetUser(string first, string last)
{

}

// Function: makeUsername
/* Purpose: Takes three parameters representing a person's first name, middle name 
   and last name and will return a string consisting of the first letter of the 
   person's first name and middle name, the first 5 characters of the users last 
   name, all in lowercase. 
*/
string makeUsername(string first, string middle, string last)
{

}

// Function: pow
/* Purpose: Takes two parameters representing a base and an exponent and return the base raised to the power of the exponent. 
*/
int pow(int base, int exponent)
{

}

// Function: factorial
/* Purpose: Takes an integer parameter, n, and returns the factorial of n. 
*/
int factorial(int n)
{

}
