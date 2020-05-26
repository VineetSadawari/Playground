#include<iostream>
#include<string>
#include<algorithm>
using namespace std;
int main()
{
  std::string str;
  std::getline(std::cin,str);
  std::string btr;
  std::getline(std::cin,btr);
  std::reverse(btr.begin(),btr.end());
  
  if(str==btr){
  cout<<"It is correct ";
  }
  else{
  cout<<"It is wrong ";
  }
  
}