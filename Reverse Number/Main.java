#include <iostream>
using namespace std;
int main() 
{
int a,b,c=0;
  cin>>a;
  
  
 while(a>0)
 {
 c=c*10+a%10;
   a=a/10;
 
 }
  cout<<c;
  
	return 0;
}