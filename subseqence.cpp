// subsequnece type problems

// given a string find all subsets of given string


#include<bits/stdc++.h>
using namespace std;

vector<string>res;

void subsequence(string s,int i,string out){
	
	if(i==s.length()){
		 
		 res.push_back(out);
		 cout<<out<<endl;
		 return;
		}
	
		string out1=out;
		out1.push_back(s[i]);
		
		subsequence(s,i+1,out1);
		subsequence(s,i+1,out);
		
	}
	
	// include a
	
	


int main(){
	
	string s="abc";
	
	int n=s.length();   // subset ==subsequece !-substring
	
	
    subsequence(s,0,"");	
	
	cout<<res.size();
	
}
