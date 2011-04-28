/*
     Name: John Stitt
     Email: jmstitt@olemiss.edu
     Program Source File Name: HPTestProgram.cpp
     Current Date: 2/15/2011
     Course Information: CSci 390 - Section 01
     Instructor: Ms. C. B. Zickos
     Program Description: Program creates a "health profile" for the user, and provides the user with a target 		heart rate for workouts as well as their BMI.
     Sources Consulted: Book and Lab4 source code for reference.
    
     Honor Code Statement: In keeping with the honor code policies of the University of Mississippi, the School of 		Engineering, and the Department of Computer and Information Science, I affirm that I have neither given nor 		received assistance on this programming assignment. This assignment represents my individual, original 		effort.
                    ... My Signature is on File.
*/ 

#include<iostream>
#include "HealthProfile.h"
using namespace std;

int main(){
        string firstname;
        string lastname;
        char gender;
        int day;
        int month;
        int year;
        double height;
        double weight;

        cout << "Enter your information in the fields: " << endl;
        cout << "\tEnter your first name: ";
        cin >> firstname;
        
        cout << "\tEnter your last name: ";
        cin >> lastname;
        
        cout << "\tEnter your gender (m/f): ";
        cin >> gender;
        
        cout << "\tEnter the day of the month you were born (DD): ";
        cin >> day;
        
        cout << "\tEnter the month you were born (MM): ";
        cin >> month;
        
        cout << "\tEnter the year you were born (YYYY): ";
        cin >> year;
        
        cout << "\tEnter your height in inches: ";
        cin >> height;
        
        cout << "\tEnter your weight in pounds: ";
        cin >> weight;
        
        HealthProfile hpOne(firstname, lastname, gender, day, month, year, height, weight);
        
        hpOne.getTargetHeartRate();
        cout << "\tYour BMI is: " << hpOne.getBMI() << endl;
}
