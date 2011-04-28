/*
     Name: John Stitt
     Email: jmstitt@olemiss.edu
     Program Source File Name: Employee.cpp
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

#include <iostream>
#include "Employee.h"
using namespace std;

// constructor
Employee::Employee( string name, string lName, int pay )
{
        setFirstName( name );
        setLastName( lName );
        setMonthlySalary( pay );
}

void Employee::setFirstName( string name )
{
      firstName = name;
}
string Employee::getFirstName()
{
   return firstName;
}

void Employee::setLastName( string name )
{
      lastName = name;
}
string Employee::getLastName()
{
   return lastName;
}

void Employee::setMonthlySalary( int pay )
{
        if( pay > 0 )
        {
                monthlySalary = pay;
        }
        else
        {
                monthlySalary = 0;
        }
}
int Employee::getMonthlySalary()
{
        return monthlySalary;
}

int Employee::getYearlySalary()
{
        return getMonthlySalary()*12;
}
