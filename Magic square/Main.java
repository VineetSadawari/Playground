#include<iostream>
using namespace std;
int main()
{
  int r,su=0,s=0;
  cin>>r;
  int a[r][r];
  for(int i=0;i<r;i++){
  		for(int j=0;j<r;j++){
           cin>>a[i][j];
          if(i==j)
            su=su+a[i][j];
          if(i+j==r-1)
            s=s+a[i][j];
        }
  }
  if(su==s)
    cout<<"Yes";
  else
    cout<<"No";
  
}