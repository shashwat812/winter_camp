#include<bits/stdc++.h>
using namespace std;

int main(){
    int n;
    cout<<"enter no of elements in array = ";
    cin>>n;
    int arr[n];
    cout<<"enter elements in array = ";
    for (int i = 0; i <n; i++)
    {
        cin>>arr[i];
    }
    cout<<" array is = ";

    for (int i = 0; i <n; i++)
    {
        cout<<arr[i]<<" ";
    }

    int min = arr[0];

    for (int i = 1; i <n; i++)
    {
        if (arr[i-1]>arr[i])
        {
            min =arr[i];
        }
        
    }
    cout<<"/n Smallest element is = "<<min;
    return 0;
};