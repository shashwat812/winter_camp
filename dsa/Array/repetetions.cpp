#include<bits/stdc++.h>
using namespace std;

int main(){
    string s;
    
    int curr=1,best=0;
    cin>>s;
    int l=s.length();    


    for(int i=0;i<l;i++){
        if(s[i]!=s[i+1]){
            best= max(best,curr);
            curr=0;
        }
        curr++;
    }

    cout<<best;
    return 0;
};