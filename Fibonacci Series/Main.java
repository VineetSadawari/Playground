#include<iostream>
using namespace std;
int fib(int p)
{
	if(p<=1)
      return p;
    
return fib(p-1)+fib(p-2);
}

int main()
{
  int a;
  cin>>a;
  cout<<"The term "<<a<<" in the fibonacci series is "<<fib(a-1);
  
}