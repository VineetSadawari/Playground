#include<iostream>
using namespace std;
int main()
{
  int p,c,count=0;
  cin>>p;
  int marks[p];
  for(int i=0;i<p;i++)
  {
  		cin>>marks[i];
    }
  cin>>c;
  for(int i=0;i<p;i++)
  {
  		if(c==marks[i])
        {
          count++;
          
        }
    }
  
  if(count==1)
    cout<<"She passed her exam";
  else
    cout<<"She failed";
}