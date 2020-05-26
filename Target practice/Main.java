#include<iostream>
using namespace std;
int main()
{
  int a=0,b,c,x=0;
  cin>>b;
  while(!(a>=b))
  {
  cin>>c;
    a=a+c;
  	x++;
  }
  cout<<"The number of turns is "<<x;
}