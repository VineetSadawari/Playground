#include<iostream>
#include <math.h>
using namespace std;
int main()
{
  int a,b,c,z,f;
  cin>>a;
  c=0;
  b=a;
    while(b!=0)
    {
    c++;
    b=b/10;
    }
   	
  	b=a*a;
    z=pow(10,c);
  	f=b/z+b%z;
   	
    if(f==a)
     cout<<"Kaprekar Number";
  else
    cout<<"Not a Kaprekar Number";
}