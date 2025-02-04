#include<bits/stdc++.h>
using namespace std;


vector<string> words;

void throwCoin(int n,string &ans){
	
	if(n == 0)
	{
	//	cout<<ans<<endl;
		words.push_back(ans);
		return;
	}
	
	string ans1 = ans + 'H';
	string ans2 = ans + 'T';
	
	throwCoin(n-1,ans1);
	throwCoin(n-1,ans2);
	

	
}

int main(){
	
	
	
	string ans = "";
	
	throwCoin(3,ans);
	
	sort(words.begin(),words.end());
	
	for(string s :words){
		cout<<s<<endl;
	}
	
}
