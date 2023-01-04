#include<bits/stdc++.h>
using namespace std;

int main(){
    int n;
    cin>>n;
    int arr[n];
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    int k=1;
    for (int j = 0; j < n-1; j+=2)
    {   
        int temp=arr[k];
        arr[k]=arr[j];
        arr[j]=temp;
        k+=2;

    }
    for(int i=0;i<n;i++){
        cout<<arr[i]<<" ";
    }
    return 0;
};