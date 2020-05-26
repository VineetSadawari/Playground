#include <iostream>
using namespace std;

int sum(int p)
{	
  int q,sums=0;
 while(p!=0)
 {
  q=p%10;
  p=p/10;
  sums+=q;
 }
  if(sums/10==0)
    return sums;
  else
    sum(sums);
  
}

int main()
{
  int a;
  cin>>a;
  cout<<sum(a);

}