#include<bits/stdc++.h>
using namespace std;


int main(){
    int arr[]= {1,4,1,2,7,5,2};
    int a=0;
    int b=10;
    int size= sizeof(arr)/sizeof(arr[0]);

    int count[b]={};

    cout<<"arr[] : ";
    for(int i=0;i<size;i++){
        cout<<arr[i]<<" ";
    }
    for(int i=0;i<size;i++){
        count[arr[i]]++; // storing count of arr[]
    }
    
    cout<<"\ncount[] : ";
    for(int i=0;i<b;i++){
        cout<<count[i]<<" ";
    }
    int l=0;
    for(int i=0;i<b;i++){
        int k=count[i];
       
            for(int j=0;j<k;j++){
                arr[l]=i;
                l++;
            
        }
        
    }

    cout<<"\nsorted arr[] : ";

    for(int i=0;i<size;i++){
        cout<<arr[i]<<" ";
    }
    
    return 0;
};