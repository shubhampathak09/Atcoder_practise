
#include<bits/stdc++.h>
using namespace std;


int solveFrogJump(vector<int> a, int n){
	
	if(n==0)
	return a[0];
	
 
	
	int jump1=solveFrogJump(a,n-1) + abs(a[n]-a[n-1]);
	int jump2=INT_MAX;
	if(n>1)
	 jump2=solveFrogJump(a,n-2) + abs(a[n]-a[n-2]);
	
	int minEnergy=min(jump1,jump2);
	
	return minEnergy;
	
		
}

int main(){
	
	vector<int>a={7,10,60,10,60,50};
	
	int n=a.size();
	
	
	int solve=solveFrogJump(a,n-1);  // min req to 0 to n-1
	
	
	cout<<solve;
	
}
