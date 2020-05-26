#include<iostream>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{ 	
  	int x,c=0,sum=0,t;
  	x=n;
  t=n;
  
    while(x!=0)
    {
    	x=x/10;
      	c++;
     }
    x=n;
     while(t!=0)
    {
    	t=x%10;
     sum+=power(t,c);
       x=x/10;
      	
     }
  
  if(sum==n)
    return 1;
  else
    return 0;
  
  
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}