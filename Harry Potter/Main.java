#include<iostream>
using namespace std;
int main()
{
  int a,b,c;
  cin>>a;
  b=a/1000;
  c=a%1000;
  c=c%100;
  c=c%10;
  cout<<b+c;
}