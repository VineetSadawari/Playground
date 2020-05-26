#include<iostream>
using namespace std;
int main()
{
  int a,b,c,s,k;
  
  k=2;
  cin>>a;
  b=0;
  c=1;
  s=0;
while(k!=a)
{
s=b+c;
  b=c;
  c=s;
  
k++;
}
  cout<<s<<" ";
}