#include <iostream>
using namespace std;
int main(){

int a,b,c,d;
  cin>>a;
  c=1;
     for(int i=0;i<a;i++)
     {
     for(int j=0;j<=i;j++)
     {
     cout<<c;
       if(j<i)
         cout<<"*";

     }
     c++;
       cout<<"\n";

     }
  	c--;
  
  for(int i=a-1;i>=0;i--)
     {
     for(int j=0;j<=i;j++)
     {
     cout<<c;
       if(j<i)
         cout<<"*";

     }
     c--;
       cout<<"\n";

     }





}