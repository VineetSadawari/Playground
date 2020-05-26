#include<iostream>
using namespace std;
int main()
{
  int by,cy;
  cin>>by>>cy;
  
 // if(by>20)
   // by=by+1900
    //else
      //by=by
    if(cy>by)
      cout<<cy-by;
  else 
    cout<<cy+2000-by-1900;
}