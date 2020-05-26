#include <iostream>
using namespace std;
int main()
{
int a,b,c;
  cin>>a;
 
    
    for(int i=a;i<a+4;i++)
    {
    for(int j=0;j<=i-a;j++)
    {
        cout<<i;
    }
    	cout<<"\n";
      
     }

    for(int i=a+3;i>=a;i--)
    {
    for(int j=0;j<=i-a;j++)
    {
        cout<<i;
    }
    	cout<<"\n";
      
     }
}