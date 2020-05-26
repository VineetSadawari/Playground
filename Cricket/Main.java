#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int tb,tr,cr,cb,to;
  float of,crr,trr;
  cin>>tb>>tr>>cr>>cb;
  
  
  to=tb/6;
  of=cb/6+float(cb%6)/10;
  
  
  crr=cr/of;
  trr=(float)tr/to;
  
  cout<<to<<endl;
 cout<<of<<endl;
printf("%.1f\n",crr);
  printf("%.1f\n",trr);
   
  if(trr<crr)
    cout<<"Eligible to Win";
  else
    cout<<"Not Eligible to Win";
  
}