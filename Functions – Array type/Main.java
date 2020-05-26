#include<iostream>
using namespace std;
int fun(int x,int *p)
{
  int e=0,o=0;
 for(int i=0;i<x;i++)
 {
    if(p[i]%2==0)
     e++;
   if(p[i]%2!=0)
     o++;
 }  
   
   if(e==0&&o!=0)
     return 2;
   else if(e!=0&&o==0)
     return 1;
   else 
     return 3;
}



int main()
{
  int n;
  cout<<"Enter the number of elements in the array"<<"\n";
  cin>>n;
  int a[n];
  cout<<"Enter the elements in the array"<<"\n";
  for(int i=0;i<n;i++)
    cin>>a[i];
  int x=fun(n,a);
  if(x==1)
    cout<<"The array is Even";
  else if(x==2)
    cout<<"The array is Odd";
  else 
    cout<<"The array is Mixed";
}