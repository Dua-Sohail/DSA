#include<iostream>
using namespace std;
int DecitoBin(int num){
    int ans=0, pow=0;
    while(num>0){
        int rem=num%2;
        num/=2;
        ans=rem+pow;
        pow*=10;
    }
    return ans;
}
int main(){
    int n;
    cout<<"Enter the number(in decimal): ";
    cin>>n;
    cout<<"The conversion of "<<n<<" into Binary is: "<<DecitoBin(n);
    return 0;
}