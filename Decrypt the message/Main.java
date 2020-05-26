#include <iostream>
using namespace std;
int main()
{
int l,u,sum=0,t;
    cin>>l>>u;
  
  	t=l+u;
       
    for(int j=1;j<=(t+1)/2;j++)
    {
    		if((t%j)==0){
                sum=sum+j;
                }
     }
        if(sum==t)
              cout<<"They can read the message";
  		else
             cout<<"They can't read the message";
   
 }


    
    