#include<iostream>
using namespace std;
int main()
{
  int a,b,c;
  
  cin>>a>>b>>c;
  
  if(c>a&&c<=a*2||c>a*(b-2)&&c<=a*(b-1))
  {
  cout<<"It is a mango tree";
  }
  else
    cout<<"It is not a mango tree";
}
