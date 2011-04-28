/*
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
        
        cout << "\tEnter your day of birth (DD): ";
        cin >> day;
        
        cout << "\tEnter your month of birth (MM): ";
        cin >> month;
        
        cout << "\tEnter your year of birth (YYYY): ";
        cin >> year;
        
        cout << "\tEnter your height: ";
        cin >> height;
        
        cout << "\tEnter your weight: ";
        cin >> weight;
        
        HealthProfile hpOne(firstname, lastname, gender, day, month, year, height, weight);
}
