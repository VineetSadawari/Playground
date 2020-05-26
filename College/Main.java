#include<iostream>
#include<string.h>
using namespace std;
struct college
{
  char name[100];
  char city[100];
  int year;
  float per;
};
int main()
{
  //Type your code here.
  struct college c[100],t;
  int n,i,j;
  cout<<"Enter the number of colleges";
  cin>>n;
  for(i=0;i<n;i++)
  {
    cout<<"\nEnter the details of college "<<i+1;
    cout<<"\nEnter name";
    cin>>c[i].name;
    cout<<"\nEnter city";
    cin>>c[i].city;
    cout<<"\nEnter year of establishment";
    cin>>c[i].year;
    cout<<"\nEnter pass percentage";
    cin>>c[i].per;
   }
  for(i=0;i<n;i++)
  {
    for(j=i+1;j<n;j++)
    {
      if(strcmp(c[i].name,c[j].name)>0)
      {
        t=c[i];
        c[i]=c[j];
        c[j]=t;
      }
    }
  }
  cout<<"\nDetails of colleges";
  for(i=0;i<n;i++)
  {
    cout<<"\nCollege:"<<i+1;
    cout<<"\nName:"<<c[i].name;
    cout<<"\nCity:"<<c[i].city;
    cout<<"\nYear of establishment:"<<c[i].year;
    cout<<"\nPass percentage:"<<c[i].per;
  }
}