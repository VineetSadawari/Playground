#include<iostream>
using namespace std;
int main()
{
  int item;
  float templ;
  cin>>item>>templ;
  
  if(item==2)
    cout<<(templ+(50*templ)/100);
  else if(item==3)
    cout<<2*templ;
  else
    cout<<"Number of items is more";
  
}