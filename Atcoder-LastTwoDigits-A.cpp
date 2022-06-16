// abc252 a

#include<bits/stdc++.h>
using namespace std;

int main(){
	
	int n;
	
	cin>>n;
	
	
//	cout<<(n % 100);
	
	
	string ans=to_string(n);
	
	int len=ans.length();
	
	cout<<ans.substr(len-2,2);
	
	
	
}
