#include<iostream>
using namespace std;
int main()
{
 int a,b,c,i,m;
  float n,p;
  n=0.0; 
 for(int i=0;i<3;)
  {
    cin>>a;
    if(a<0)
    {
        n=n-1;
        break;
        
    }
    else if(a%2==0)
    {
        
    n=n-0.5;    
        
    }
    else{
        n=n+1;
      i++;
    }
  }
  cout<<n;
  
}