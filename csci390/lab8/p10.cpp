#include <iostream>
using namespace std;

int main ()
{    
    cout << "\n\nOn this machine " << sizeof(int) 
         << " bytes are allocated to each int " << endl;

    int r[ 10 ];

    cout << "Just allocated an array of 10 ints named r..." << endl;
    
    cout << "1. sizeof r =" << (sizeof r) << endl;
    cout << "2. sizeof *r=" << (sizeof ( *r ) ) << endl;
    cout << "3. (sizeof(*r)/sizeof(int))= " << (sizeof ( *r ) / sizeof ( 
int
)) << endl;
    cout << "4. (sizeof r / sizeof ( int ))  =" << (sizeof r / sizeof ( int ))
<< endl;	

    cout << "\n\nWhich of these can be used to calculate the number of 
elements in the array?";
    

}
