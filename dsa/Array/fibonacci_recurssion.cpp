#include<bits/stdc++.h>
using namespace std;
 
int fibonacci(int f){
    if(f<=1){
        return 1;
    }
    return fibonacci(f-2) + fibonacci(f-1);
}

int main(){

    int n;
    cout<<"enter no :";
    cin>>n;
    
    for (int i = 0; i < n; i++)
    {
        cout<<fibonacci(i)<<" ";
    }
    
    return 0;
};