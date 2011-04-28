#include <iostream>
using namespace std;

int main() {
   int x, y;
   int * ptr = &x; 
   *ptr = 7; 

	cout << "The value of x is " << x << endl;

   ptr = &y; 

	*ptr = 8;

	cout << "The value of x is " << x << endl;
	cout << "The value of y is " << y << endl;
}
