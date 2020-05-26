#include<iostream>
using namespace std;
int main()
{
int r,c;
  cin>>r>>c;
  int a[r][c],max[r][c],maxx;
  
  for(int i=0;i<r;i++)
  {
  for(int j=0;j<c;j++)
  {
   cin>>a[i][j];
  }
  }
  
   
  
  
  for(int i=0;i<r;i++)
  {
    maxx=a[i][0];
  for(int j=0;j<c;j++)
  {
   if(maxx<a[i][j])
     maxx=a[i][j];
  }
    cout<<maxx<<endl;
  }
 
  
  
  
  
 
}