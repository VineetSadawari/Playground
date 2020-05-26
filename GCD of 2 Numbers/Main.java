#include<iostream>
using namespace std;

int gcd(int x,int y,int p)
{  
     
    
	if(x%p==0 && y%p==0)
      	return p;
     else
       gcd(x,y,p-1);

}

int main()
{
  int a,b,s;
  cin>>a>>b;
  if(a>b)
    s=b;
  else
    s=a;
  cout<<"G.C.D of "<<a<<" and "<<b<<" = "<<gcd(a,b,s);
  
}