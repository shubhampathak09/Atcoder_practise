// nth fibonnaci
#include<bits/stdc++.h>
using namespace std;



int f(int n){
	
	if(n==1 || n==0)
	return n;
	
	return f(n-1) +f(n-2);
	
	
}

int main(){
//	f(n) = f(n-1 ) +f(n-2)

// recursive case and base case

cout<<f(7)<<endl;
cout<<f(5);


}
