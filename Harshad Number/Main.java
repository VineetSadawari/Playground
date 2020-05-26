#include<iostream>
using namespace std;
int main()
{
  int a,b,k=0;
  cin>>a;
  b=a;
  
  while(a>0)
  {
  k=k+a%10;
    a=a/10;
  
  }
  if(b%k==0)
    cout<<"Harshad Number";
  else
    cout<<"Not Harshad Number";
}