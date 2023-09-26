#include<bits/stdc++.h>
using namespace std;



void perm(int pos,string &s ,vector<string> &ans){
	
	if(pos>=s.length()){
		ans.push_back(s);
		return;
	}
	
	for(int i =0;i<s.length();i++){
		swap(s[i],s[pos]);
		perm(pos+1,s,ans);
		swap(s[i],s[pos]);
	}
	
	
}

void printAns(vector<string>&ans){
	
	for(string s : ans){
		cout<<s<<endl;
	}
}

int main(){
	
	
	vector<string>ans={};
	
	string inp="abc";
	perm(0,inp,ans);
	
	
	sort(ans.begin(),ans.end());
	
	printAns(ans);
	
}
