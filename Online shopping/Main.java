#include<iostream>
using namespace std;
int main()
{
  int fa,fb,fc,sa,sb,sc,aa,ab,ac;
  int flip,snap,amaz;
  cin>>fa>>fb>>fc>>sa>>sb>>sc>>aa>>ab>>ac;
  flip=fa-(fb*fa)/100+fc;
  snap=sa-(sb*sa)/100+sc;
  amaz=aa-(ab*aa)/100+ac;
  
   
  cout<<"In Flipkart Rs."<<flip<<endl;
  cout<<"In Snapdeal Rs."<<snap<<endl;
  cout<<"In Amazon Rs."<<amaz<<endl;
  if(flip<=snap&&flip<=amaz)
  	cout<<"He will prefer Flipkart"<<endl;
  else if(snap<amaz)
    cout<<"He will prefer Snapdeal"<<endl;
  else
    cout<<"He will prefer Amazon"<<endl;
  
}