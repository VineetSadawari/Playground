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
  cout<<"Enter the number of students";
  cin>>n;
  for(i=0;i<n;i++)
  {
    cout<<"\nEnter the details of student "<<i+1;
    cout<<"\nEnter name";
    cin>>c[i].name;
    cout<<"\nEnter department";
    cin>>c[i].city;
    cout<<"\nEnter year of study";
    cin>>c[i].year;
    cout<<"\nEnter cgpa";
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
  cout<<"\nDetails of students";
  for(i=0;i<n;i++)
  {
    cout<<"\nStudent "<<i+1;
    cout<<"\nName:"<<c[i].name;
    cout<<"\nDepartment:"<<c[i].city;
    cout<<"\nYear of study:"<<c[i].year;
    cout<<"\nCGPA:"<<c[i].per;
  }
}
