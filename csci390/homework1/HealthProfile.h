/*
 */

#include<string>
using namespace std;

class HealthProfile{
public:
	HealthProfile(string, string, char, int, int, int, double, double);
	void setFirstName(string);
	string getFirstName();
	void setLastName(string);
	string getLastName();
	void setGender(char);
	char getGender();
	void setMonth(int);
	int getMonth();
	void setDay(int);
	int getDay();
	void setYear(int);
	int getYear();
	void setHeight(double);
	double getHeight();
	void setLbs(double);
	double getLbs();
	double getAgeInYears();
	double getMaxHeartRate();
	double getTargetHeartRate();
	double getBMI();
private:
	string firstName;
	string lastName;
	char gender;
	int month;
	int day;
	int year;
	double height;
	double lbs;
	double  mhr;
	double bmi;
	double aiy;
	double thr;
	

};
