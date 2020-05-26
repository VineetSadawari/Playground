#include<iostream>
using namespace std;
int main()
{
  int n,c=1;
  cin>>n;
  int arr[n];
  cout<<1<<"\n";
  for(int i=0;i<n;i++){
  cin>>arr[i];
  }
  for(int i=0;i<n-1;i++){
  if(arr[i]>arr[i+1]){
  cout<<1<<"\n";
  }
    else{
    cout<<2*c<<"\n";
      c++;
    }
  }
}