/*
        Name: John Stitt
        Email: jmstitt@olemiss.edu
        Program Source File Name: testEmployee.cpp
        Current Date: 2/15/2011
        Course Information: CSci 390 - Section 01
        Instructor: Ms. C. B. Zickos
        Program Description: 
        Sources Consulted: Book
                                        
        Honor Code Statement: In keeping with the honor code policies of the University of Mississippi, the School of Engineering, and the Department of Computer and Information Science, I affirm that I have neither given nor received assistance on this programming assignment. This assignment represents my individual, original effort.
                ... My Signature is on File.
*/

#include <iostream>
#include "Employee.h"
using namespace std;

int main()
{
        Employee empOne("Bradley", "Balducci", 1500);
        Employee empTwo("Barry", "Molpus", 1000);
        
        cout << empOne.getFirstName()  << " " << empOne.getLastName() << "'s yearly salary is: " << empOne.getYearlySalary() << endl;
        cout << empTwo.getFirstName() << " " << empTwo.getLastName() << "'s yearly salary is: " << empTwo.getYearlySalary() << endl;
        cout << endl;
        
        int empOneRaise;
	int empTwoRaise;
        empOneRaise = empOne.getMonthlySalary() + (empOne.getMonthlySalary() * .10);
        empOne.setMonthlySalary(empOneRaise);
	empTwoRaise = empTwo.getMonthlySalary() + (empTwo.getMonthlySalary() * .10);
        empTwo.setMonthlySalary(empTwoRaise);
        
        cout << "After a raise, " << empOne.getFirstName() << " " << empOne.getLastName() << "'s yearly salary is: " << empOne.getYearlySalary() << endl;
	cout << "After a raise, " << empTwo.getFirstName() << " " << empTwo.getLastName() << "'s yearly salary is: " << empTwo.getYearlySalary() << endl;
}
