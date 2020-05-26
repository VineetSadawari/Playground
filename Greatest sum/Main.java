#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  #include<iostream>
using namespace std;


  int  m ,n;
  cin>>m;
  cin>>n;
  int a[m][n],r[m],c[n];

  for(int i = 0; i < m; i++){
        for(int j = 0; j < n; j++)
            cin>>a[i][j];
        }
  int sum = 0,maxc=0,maxr=0;
  for(int i = 0; i < n; i++){
        sum = 0;
        for(int j = 0;j < m; j++){
          sum+=a[j][i];   
        }
        c[i] = sum;
  }
  for(int i = 0; i < m; i++){
        sum = 0;
        for(int j = 0;j < n; j++){
          sum+=a[i][j];   
        }
        r[i] = sum; 
  }
  int k,l;
  for(int j = 0;j<m;j++) {
    if(maxr<r[j]) {
      maxr=r[j]; 
      k = j;
   }
  }
  for(int j = 0;j<n;j++) {
    if(maxc<c[j]) {
      maxc=c[j]; 
      l = j; 
    }
  }
  cout<<"Sum of rows is ";
  for(int i=0;i<m;i++)
    cout<<r[i]<<" ";
  cout<<"\nRow "<<k+1<<" has maximum sum"<<endl;
  cout<<"Sum of columns is ";
  for(int i=0;i<n;i++)
    cout<<c[i]<<" ";
  cout<<"\nColumn "<<l+1<<" has maximum sum"<<endl; 
}