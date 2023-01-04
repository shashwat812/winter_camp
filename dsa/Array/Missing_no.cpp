
#include <iostream>

using namespace std;

int main()
{ 
    long long int sum=0,sum2=0;
    long long int n,arr[1000000];
    
    cin>>n;
    
    for(int i=0;i<n-1;i++){
        cin>>arr[i];
    }
    
    
    for(int i=0;i<n-1;i++){
        sum = sum + arr[i];
    }
    
    sum2=(n*(n+1))/2;
    
    cout<<sum2-sum;
    
    return 0;
}