#include<iostream>
using namespace std;
int main()
{
  int a,b,c;
  cin>>a;
  for(int i=1;i<=a;i++)
  {
    if(i%2==0)
      cout<<((i*i)-2)<<" ";
    else
      cout<<((i*i)-1)<<" ";
  }
}