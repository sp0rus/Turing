#include <iostream>

using namespace std;

int main()
{
	double height;
	double weight;

	cout << "Enter your weight in pounds: ";
	cin >> weight;
	cout << endl;

	cout << "Enter you height in inches: ";
	cin >> height;
	cout << endl;

	double bmi;
	bmi = (weight*703)/(height*height);

	cout << "Your BMI is: " << bmi << endl;
}

