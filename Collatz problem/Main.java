#include<iostream>
using namespace std;
int main()
{
  int a,b=0;
  cin>>a;
  
  while(a)
  {
    if(a==1)
       {
    cout<<a<<endl;
    a=3*a+1;
      cout<<b<<endl;
      break;
    }
      
  if(a%2==0){
  cout<<a<<endl;
    a=a/2;
    b++;
  }else
    {
    cout<<a<<endl;
    a=3*a+1;
    b++;
    }
  
  }
}