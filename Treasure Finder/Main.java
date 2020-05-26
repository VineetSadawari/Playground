#include<iostream>
using namespace std;
int main()
{
  int a,b,c,temp,least;
  cin>>a>>b>>c;
  
  if(b>a)
  {
    if(c>b)
      temp=b;
    else
      temp=c;
  }
   else if(c>a)
    temp=a;
    else if(b>c)
      temp=b;
  else
    temp=c;
  
  
  if(a<b&&a<c)
    least=a;
  else if(b<c)
    least=b;
    else
      least=c;
    
    
    
  
  cout<<"The treasure is in box which has number "<<temp<<endl;
  int i=1;
  int gcd=1;
  
  
  while(i<=least)
  {
  if(a%i==0&&b%i==0&&c%i==0){
         gcd=i;
  }
  i++;
  }
  cout<<"The code to open the box is "<<gcd;
  
}