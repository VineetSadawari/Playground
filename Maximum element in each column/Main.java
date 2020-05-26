#include<iostream>
using namespace std;
int main()
{
  int r,c;
  cin>>r>>c;
  
  int a[r][c],max;
  
   
  
  for(int i=0;i<r;i++)
  {
  	for(int j=0;j<c;j++)
        {
      cin>>a[i][j];
         }
  }
  
  
   
  
  
  for(int j=0;j<c;j++)
  {  
  	for(int i=1;i<r;i++)
    {
      	max=a[1][j];
       if(max<a[i][j]){
        max=a[i][j];
       }
         
    		
    }
    cout<<max<<endl;
  }
  
}