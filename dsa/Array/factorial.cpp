#include<bits/stdc++.h>
using namespace std;

int main(){
    int n,i;
    int f=1;
    cout<<"Enter no. ";
    cin>>n;

    for (i =n; i >=1; i--)     
    {
        f=f*i;
        
    }

    cout<<"Factorial is :"<<f; 
    
    return 0;
};