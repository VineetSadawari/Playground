#include <iostream> 
using namespace std;  
int main() 
{ 
	string str;
    cin>>str; 
   int count = 0;
	int l = str.length(); 
	for (int i = 0; i < l; i++) { 
	    count++;
	}
  cout<<"The number of letters in the name is "<<count;
     
	return 0; 
} 
