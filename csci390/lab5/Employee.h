/*
     Name: John Stitt
     Email: jmstitt@olemiss.edu
     Program Source File Name: Employee.h
     Current Date: 2/15/2011
     Course Information: CSci 390 - Section 01
     Instructor: Ms. C. B. Zickos
     Program Description:
     Sources Consulted: Book

     Honor Code Statement: In keeping with the honor code policies of the University of Mississippi, the School of Engineering,      and the
Department of Computer and Information Science, I affirm that I have neither given nor received assistance on this      programming assignment. This
assignment represents my individual, original effort.
                    ... My Signature is on File.
*/

#include <string>
using namespace std;

class Employee
{
public:
        Employee( string, string, int );
        void setFirstName( string );
        string getFirstName();
        void setLastName( string );
	string getLastName();
        void setMonthlySalary( int );
        int getMonthlySalary();
        int getYearlySalary();
private:
        string firstName;
	string lastName;
	int monthlySalary;
};
