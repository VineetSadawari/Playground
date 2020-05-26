#include<iostream>
using namespace std;
int main()
{
  int a,b,even=0,odd=0,x;
  cin>>a;
  b=a;
  while(a!=0)
  {
     x=a%10;
   	 a=a/10;
     if(x%2==0)
       even=even+x;
     else
       odd=odd+x;
  }
  if(even==odd)
    cout<<"Yes";
  else
    cout<<"No";
  
}