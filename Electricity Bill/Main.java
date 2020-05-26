#include<iostream>
using namespace std;
int main()
{
  int units;
  cin>>units;
  int a=units;
  if(units<=200)
  {
    int temp=a*0.5;
   cout<<"Rs."<<temp;
  }
  else if(units<=400)
  {
  cout<<"Rs."<<a*0.65+100;
  }
  else if(units<=600){
  cout<<"Rs."<<a*0.8+200;
  
  }
   else if(units>600){
  cout<<"Rs."<<a*1.45+425;
  
  }
}