#include<bits/stdc++.h>
using namespace std;

int pow(int a,int b){
    if(b==0){
    return 1;}
    else if(b%2==0){
    int y=pow(a,b/2);
    return y*y;}
    else{
        return a*pow(a,b-1);
    }

}

int main(){
    cout<<"Enter no. :";
    int x,y;
    cin>>x>>y;
    cout<<pow(x,y);
    return 0;
};