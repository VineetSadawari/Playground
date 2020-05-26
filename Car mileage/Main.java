#include<iostream>
using namespace std;
int main()
{
  float mil;
  int ltr,dist;
  cin>>mil>>ltr>>dist;
  
  if(ltr*mil<=dist)
    cout<<"Cannot reach";
  else
    cout<<"Can reach";
}