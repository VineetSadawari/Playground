#include<iostream>
using namespace std;
void queue(int x,int y, int *c)
{
  int count=0,sum=0;
  for(int i=0; i<y; i++)
  {
    if(i==0)
    {  sum=c[i]; }
    else
    {  sum=c[i]+c[i-1]; }
    if(x<=sum)
    {
    	count++;
    }
  }
  if(x==y)
    cout<<x;
  else
    cout<<count;
}
int main()
{
  //Type your code here.
  int n;
  int m;
  cin>>n>>m;
  int a[n];
  for(int i=0; i<n; i++)
  {
   cin>>a[i]; 
  }
  queue(m,n,a);
    return 0;
}