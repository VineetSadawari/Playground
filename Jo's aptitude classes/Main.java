#include <iostream>
using namespace std;
int main()
{
int a,b,c,d,small,gcd;
  cin>>a>>b>>c>>d;
  if(a<b&&a<c)
    	small=a;
  else if(b<c)
      small=b;
  	else	
      small=c;
  
  while(small!=0)
  {
   		if(a%small==0 && b%small==0 && c%small==0)
        {
        	gcd=small;
              break;
        }
          small--;
  
  }
  
  if(d==gcd)
    cout<<"Answer is correct.";
  else
    cout<<"Answer is wrong.";

return 0;
}
