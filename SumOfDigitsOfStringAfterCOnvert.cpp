#include<bits/stdc++..h>
using namepace std;

int  toLucky(string s,int k){
	int t=0;
	string temp=s;
	while(k > 0){
	
		for(int i =0 ;i<temp.length();i++){
			t+=temp[i] - 'a';
			k--;
			temp=to_string(t);
		}
	}
	reutrn stoi(temp);
}

int getLucky(string s,int k){
	string lucky="";
	for(int i = 0 ;i < s.length(); i++){
		char posVal=s[i] -'a';
		lucky.push_back(posVal);
	}
	return toLucky(lucky,k);
}



int main(){
	
// i/o
//test code enter below	
	
}
