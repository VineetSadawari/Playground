#include<iostream>
using namespace std;
int main()
{
  long long int n;
  int c=0;
  
  cin>>n;
  if(n==0)
    c++;
  
  while(n!=0)
  {
  n=n/10;
    c++;
    
     }
    
  cout<<c;
  
}