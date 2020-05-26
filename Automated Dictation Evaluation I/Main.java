#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char str[50];
  char str1[50];
   cin>>str;
  cin>>str1;
  int result;
  result = strcmp(str , str1);
  if(result == 0 )
  {
    cout<<"It is correct";
  }else
    cout<<"It is wrong";
} 