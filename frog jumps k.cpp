// k -> i+1 i+2 i+3 ..k
#include<bits/stdc++.h>
using namespace  std;

int f(int index,int n){
	
	if(index==0)
	return 0;
	
	int index=-1;
	int energySpent=INT_MAX;
	 
	for(int i=1;i<=k;i++){
	  if(index-i>=0)
	  int jump=f(index-i) + abs(a[n]-a[index-1]);
	  else 
	  break;
	  energySpent=min(jump,energySpent);
	} 
	
	return energySpent;
}

int main(){
	
	
	
}
