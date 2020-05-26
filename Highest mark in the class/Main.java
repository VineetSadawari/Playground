#include<iostream>
using namespace std;
int main()
{
  int m;
  cin>>m;
  int mo[m];
  int max;
  for(int i=0;i<m;i++){
    cin>>mo[i];
  	  }
     max=mo[0];
   for(int i=0;i<m;i++){
    if(max<=mo[i])
      max=mo[i];
    	  }
  cout<<max;
}