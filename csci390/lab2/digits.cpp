#include <iostream>
using namespace std;

int main()
{
	int number; //integer read from user
	
	cout << "Enter a five-digit integer: "; //prompt
	cin >> number; //read integer from user
	
	int first = number/10000;

	cout << first;

	int second = number%10000;
	int secondout = second/1000;
	
	cout << "   " << secondout;

	int third = second%1000;
	int thirdout = third/100;

	cout << "   " << thirdout;

	int fourth = third%100;
	int fourthout = fourth/10;

	cout << "   " << fourthout;

	int fifth = fourth%10;
	
	cout << "   " << fifth << endl;
}
