#include<bits/stdc++.h>
using namespace std;

void findSortedPermutations(string a,int l,int r,set<string>&s){
	
	
	if(l==r){
		
		s.insert(a);
	//	cout<<a<<endl;
		return;
		
	}
	
	for(int k=l;k<=r;k++){
		
		swap(a[k],a[l]);
		findSortedPermutations(a,l+1,r,s);
		swap(a[k],a[l]);
	}
}

int main(){
	
	
	set<string>s;
	string inp="acb";
	findSortedPermutations(inp,0,inp.length()-1,s);
     
    // cout<<s.size();
	

	for(auto x: s){
     
	 cout<<x<<endl;		
  		
	}
}
