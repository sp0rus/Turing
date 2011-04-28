#include <iostream>
using namespace std;

int main()
{
   int a; 
   int *aPtr; 
   
   cout << "enter an integer ";
   cin >> a;

   aPtr = &a; 
   
   cout << "printing variable a directly" 
        << " (expect to see the number you entered.) " 
        << a << endl;
   cout << "printing variable a via aPtr " 
        << " (expect to see the number you entered.) " 
        << *aPtr << endl;

   cout << "printing the address of variable a " << &a << endl;
   cout << "printing the value of aPtr (expect to see the same number as above) "       << aPtr << endl;
   
} 
