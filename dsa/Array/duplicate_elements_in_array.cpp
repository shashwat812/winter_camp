#include<bits/stdc++.h>
using namespace std;

int main(){
    int n;
    cout<<"enter size of array"<<endl;
    cin>>n;
    int a[n];
    cout<<"enter elements in array"<<endl;
    for (int i = 0; i <=n-1; i++)
    {
        cin>>a[i];
    }

    for (int i = 0; i <=n-1; i++)
    {
        cout<<a[i]<<" ";
    }

    sort(a,a+n);
    cout<<"\nduplicate elements present in the array are =";
    for (int i = 0; i <= n-1; i++)
    {
        if(a[i]==a[i+1])
        cout<<a[i]<<" ";

           }
    


    
    return 0;
};