#include <iostream>
using namespace std;

void mystery( int *);

int main() {
   int number;
   cout << "enter an integer ";
   cin >> number;
   cout << "number=" << number;
   mystery( &number);
   cout << "\nnumber=" << number;
	return 0;
}

void mystery( int *nPtr)
{
   *nPtr *= *nPtr;
}
