#include <iostream>
using namespace std;

int main()
{
   int t[4] = {3, 5, 9, 11};
   int *tPtr = t;

   // echo print the array
   for (int i=0; i < 4; i++)
        cout << t[i] << endl;
   
    cout << "\n1. " << (*( tPtr + 3 )); 
    cout << "\n2. " << (tPtr[ 3 ]);     
    cout << "\n3. " << (*( t + 3 ));    
    cout << "\n4. " << (&t[ 3 ]);       
}
