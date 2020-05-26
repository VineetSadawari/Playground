#include<iostream>
using namespace std;
int pow(int a, int  b)
{
   if(b==0)
     return 1;
  return a*pow(a,b-1);

}
int main()
{
  int a,b;
  cout<<"Enter the value of a \n"
    "Enter the value of n \n";
  cin>>a>>b;
  cout<<"The value of "<<a<<" power "<<b<<" is "<<pow(a,b);
  
}