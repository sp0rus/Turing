#include <iostream>
using namespace std;
int main(){
   int x = 5, y;
   int *ptr = &x; 
   cout << *ptr << endl;
   *ptr = 7;
	cout << *ptr << endl; 
   ptr = &y;
	//store the value 10 via ptr into y
	*ptr = 10;
	cout << *ptr << endl;

	cout << "x= " << x << endl << "y= " << y << endl; 
}
