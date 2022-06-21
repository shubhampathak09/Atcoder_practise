// zigzag string


#include<bits/stdc++.h>
using namespace std;


string solve(string s,int numRows){
	
	vector<string>result(numRows,"");
	
	int i=0;
	
	int n=s.length();
	
	while(i<n){
		
		
		for(int j=0;j<numRows && i<n ;j++){
			
			result[j].push_back(s[i++]);
			
		}
		
		
		for(int j=numRows -2 ; j>=1 && i<n ;j--){
			result[j].push_back(s[i++]);
		}
		
	}
	
	
	string res="";
	
	
	for(auto x: result){
		
		res+=x
;	}
	
	
	return res;
}

int main(){
	
	string s="paypalishiring";
	
	cout<<solve(s,3);
	
	
}
