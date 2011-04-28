#include <iostream>
using namespace std;

void f( int * ); 

int main() 
{
   int y;
   f( &y );  
	cout << "The value of variable y has been set to " << y << endl;
} 
void f( int *xPtr ){
   *xPtr = 100; 
}
