// string permutation

// restore the original array while traversing back -> backtracl


#include<bits/stdc++.h>
using namespace  std;


void permute(string inp,int l,int r ){
	
	if(l==r){
		
		cout<<inp<<endl;
		return;
		
	}
	
	for(int k=l;k<=r;k++){
		
		swap(inp[l],inp[k]);
		permute(inp,l+1,r);
		swap(inp[l],inp[k]);
	}
	
	
}

int main(){
	
	string s="abc";
	permute(s,0,s.length()-1);
	
}



