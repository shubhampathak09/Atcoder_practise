#include<bits/stdc++.h>
using namespace std;


string popBlocks(string str){
	
	
	if(str.length()==1){
		return str;
	}
	
	char first = str[0];
	string rem = str.substr(1);
	string popOp = popBlocks(rem);
	if(first == popOp[0]){
		return popOp[1];
	}else
	return first+popOp;
	
}

int main()
{
	
	string s ="geeksforgeeg";
	
	string ans = popBlocks(s);
	
	
	cout<<ans;
	
}
