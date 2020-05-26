#include<iostream>
using namespace std;
int main()
{
  int a[20],n,x,v;
  cout<<"Enter the number of elements in the array"<<endl;
  cin>>n;
  cout<<"Enter the elements in the array"<<endl;
  for(int i=0;i<n;i++)
    cin>>a[i];
  cout<<"Enter the location where you wish to insert an element"<<endl;
  cin>>x;
  if(x>n)
  {
  cout<<"Invalid Input";
  return 0;
    }
  cout<<"Enter the value to insert"<<endl;
  cin>>v;
  cout<<"Array after insertion is"<<endl;
 
  for(int i=n;i>=x-1;i--)
  {     
      a[i]=a[i-1];
        if(x==i){
          a[i-1]=v;
          break;
        }
  		
     }
          
  for(int i=0;i<=n;i++)
    cout<<a[i]<<endl;
  
}