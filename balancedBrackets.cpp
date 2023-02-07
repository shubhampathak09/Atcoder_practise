// balanced brackets
#include<bits/stdc++.h>
using namespace std;


void generateBalancedBrackets(int open,int close,int n,string bracket){
	
	if(open==n && close ==n){
		
		cout<<bracket<<endl;
	}
	
	if(open<n){
		string obracket=bracket;
		obracket.push_back('(');
		generateBalancedBrackets(open+1,close,n,obracket);
		
	}
	
	if(open>close){
		string cbracket=bracket;
		cbracket.push_back(')');
		generateBalancedBrackets(open,close+1,n,cbracket);
	}
}

int main(){
	
	int n=2;
	string bracket="";
	generateBalancedBrackets(0,0,n,bracket);
	
}
