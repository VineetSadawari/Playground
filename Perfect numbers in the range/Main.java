
    
    
    
    
    #include<iostream>
using namespace std;
int main()
{
int l,u,sum;
  
  cin>>l>>u;
  
  for(int i=l+1;i<u;i++)
  {
      sum=0;
    for(int j=1;j<=(i+1)/2;j++)
    {
    		if((i%j)==0){
              sum=sum+j;
            }
      
    }
    if(sum==i)
      cout<<i<<" ";
  
  }
 
}