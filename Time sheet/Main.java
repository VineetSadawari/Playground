#include<iostream>
using namespace std;
int main()
{
  int sun,mon,tue,wed,thu,fri,sat,tot,n;
  cin>>sun;
  cin>>mon;
  cin>>tue;
  cin>>wed;
  cin>>thu;
  cin>>fri;
  cin>>sat;
  tot=0;
  n=mon+tue+wed+thu+fri;
  if(n>40)
  	tot=(n-40)*25;
  
  if(sun)
  {
    if(sun<=8)
    sun=sun*100+((sun*100)/2);
  else
    sun=sun*100+((sun*100)/2)+(sun-8)*15+((sun-8)*15)/2;
  
   
    }
    
    if(sat)
  {
  if(sat<=8)
    sat=sat*100+((sat*100)/4);
  else
    sat=sat*100+((sat*100)/4)+(sat-8)*15+((sat-8)*14)/2;
  
      
    }
  
  if(mon<=8)
    mon=mon*100;
  else
    mon=mon*100+(mon-8)*15;
  
   if(tue<=8)
    tue=tue*100;
  else
    tue=tue*100+(tue-8)*15;
  
   if(wed<=8)
    wed=wed*100;
  else
    wed=wed*100+(wed-8)*15;
  
   if(thu<=8)
    thu=thu*100;
  else
    thu=thu*100+(thu-8)*15;
  
   if(fri<=8)
    fri=fri*100;
  else
    fri=fri*100+(fri-8)*15;
  
  tot=tot+mon+tue+wed+thu+fri+sat+sun;
  
  
  cout<<tot;
  
  
  
}