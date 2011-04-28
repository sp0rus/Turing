#include <iostream>

using namespace std;

int main()
{
	double miles;
	double mpg;
	double tolls;
	double cpg;
	double fees;

	cout << "Total miles driven per day: ";
	cin >> miles; 
	cout << endl;
	
	cout << "Cost per gallon of gasoline: ";	
	cin >> cpg; 
	cout << endl;

	cout << "Average miles per gallon: ";
	cin >> mpg; 
	cout << endl;

	cout << "Parking fees per day: ";
	cin >> fees; 
	cout << endl;
	
	cout << "Tolls per day: ";
	cin >> tolls;
	cout << endl;

	double cpd = (miles/mpg)*cpg + fees + tolls;

	cout << "Your daily cost of driving to work is: $" << cpd << endl;

}
