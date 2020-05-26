#include<iostream>
using namespace std;
int main()
{
int r,c;
  cin>>r>>c;
  int a[r][c],sum=0;
  
  for(int i=0;i<r;i++)
  {
  for(int j=0;j<c;j++)
  {
   cin>>a[i][j];
  }
  }
  
  for(int i=0;i<r;i++)
  {
    
  for(int j=0;j<c;j++)
  {
    
    if(i+j==c-1) {
    sum=sum+a[i][j];
         }
      else if(i==0)
    {
    sum=sum+a[i][j];
        
    }
    else if(i==c-1)
    {
    sum=sum+a[i][j];
      
    }
    
  }
   
    
  }
   cout<<"Sum of Zig-Zag pattern is "<<sum<<endl;
  
  
}