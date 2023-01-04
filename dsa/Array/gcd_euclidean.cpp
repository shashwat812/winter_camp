#include<bits/stdc++.h>
using namespace std;

int gcd(int a,int b){
    if(a==0)
        return b;
    if(b==0)
        return a;

    if(a==b)
        return a;

    if(a>b)
        return gcd(a-b,b);
    else
        return gcd(a,b-a);

}w

int main(){
    int x,y;
    cout<<"Enter no. :";
    cin>>x>>y;

    cout<<"GCD of "<<x<<" and "<<y<<" is : "<<gcd(x,y);

    return 0;
};