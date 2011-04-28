#include <iostream>
using namespace std;

size_t getSize( double * ); 

int main()
{
   int array[ 20 ]; 
   
   cout << "#bytes in array is " 
        << sizeof( array );

   	cout << "\n#bytes from getSize is " 
     		<< getSize( array ) << endl;
   } 
   size_t getSize( double *p )
   {                            
    	return sizeof( p );     
   }
