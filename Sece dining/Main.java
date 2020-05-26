#include<iostream>
using namespace std;
int main()
{
  string a;
  int b;
  cin>>a;
  cin>>b;
  if(a=="front"){
    	if(b==1)
          cout<<"Left Handed";
        else 
            cout<<"Right Handed";
            
  }
    else {
    	if(b==1)
 			cout<<"Right Handed";
          else 
            cout<<"Left Handed";

  }
  
}