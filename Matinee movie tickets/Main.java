#include<iostream>
using namespace std;
int main()
{
  int age;
  float time;
  cin>>age>>time;
  if(time<=10.15)
  {
    if(age>13)
    cout<<"$8.00";
    else
     cout<<"$4.00";
    }
  else{
    if(age>13)
    cout<<"$5.00";
    else
     cout<<"$2.00";
}
}