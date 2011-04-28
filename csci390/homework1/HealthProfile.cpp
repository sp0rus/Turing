/*
 */

#include<iostream>
#include "HealthProfile.h"
using namespace std;

HealthProfile::HealthProfile(string fName, string lName, char gend, int month, int day, int year, double height, double lbs){
	setFirstName(fName);
	setLastName(lName);
	setGender(gend);
	setMonth(month);
	setDay(day);
	setYear(year);
	setHeight(height);
	setLbs(lbs);
	
}


void HealthProfile::setFirstName(string fName){
	firstName = fName;
}
string HealthProfile::getFirstName(){
	return firstName;
}

void HealthProfile::setLastName(string lName){
	lastName = lName;
}
string HealthProfile::getLastName(){
	return lastName;
}

void HealthProfile::setGender(char gend){
	gender = gend;
}
char HealthProfile::getGender(){
	return gender;
}

void HealthProfile::setMonth(int mnth){
	month = mnth;
}
int HealthProfile::getMonth(){
	return month;
}

void HealthProfile::setDay(int d){
	day = d;
}
int HealthProfile::getDay(){
	return day;
}

void HealthProfile::setYear(int yr){
	year = yr;
}
int HealthProfile::getYear(){
	return year;
}

void HealthProfile::setHeight(double hght){
	height = hght;
}
double HealthProfile::getHeight(){
	return height;
}

void HealthProfile::setLbs(double lb){
	lbs = lb;
}
double HealthProfile::getLbs(){
	return lbs;
}

double HealthProfile::getAgeInYears(){

	return 2011 - getYear();
}

double HealthProfile::getMaxHeartRate(){
	double mhr = 220 - getAgeInYears();	
	return mhr;
}

double HealthProfile::getTargetHeartRate(){
	double mhr0 = (.5 * getMaxHeartRate()); // fifty percent of maxheartrate
	double mhr1 = (.85 * getMaxHeartRate()); // eighty-five percent of maxheartrate
	cout << mhr0 << " - " << mhr1 << endl;
}

double HealthProfile::getBMI(){
	double bmi = (getLbs() * 703)/(getHeight() * getHeight());
	return bmi;
}
