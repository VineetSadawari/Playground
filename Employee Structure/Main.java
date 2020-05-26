#include<iostream>
using namespace std;
struct emp
{
  char name[100];
  int id;
  int age;
  char des[100];
  int sal;
};
int main()
{
  //Type your code here.
  struct emp s;
  cout<<"Enter name:";
  cin>>s.name;
  cout<<"\nEnter ID:";
  cin>>s.id;
  cout<<"\nEnter age:";
  cin>>s.age;
  cout<<"\nEnter designation:";
  cin>>s.des;
  cout<<"\nEnter Salary:";
  cin>>s.sal;
  cout<<"\nEmployee Details";
  cout<<"\nName of the Employee : "<<s.name;
  cout<<"\nID of the Employee : "<<s.id;
  cout<<"\nAge of the Employee : "<<s.age;
  cout<<"\nDesignation of the Employee : "<<s.des;
  cout<<"\nSalary of the Employee : "<<s.sal;
    
  
}
