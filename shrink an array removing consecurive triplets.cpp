//Shrink an array by removing triplets that satisfy given constraints
#include<bits/stdc++.h>
using namespace std;


int solve(vector<int>a,int k,int start,int end){
	if(start>end){
		return 0;
	}
	int res=0;
	
	res = 1 +solve(a,k,start+1,end);
	for(int i=start+1;i<end;i++){
		for(int j=i+1;j<end;j++){
			if(a[i]==a[start]+k && a[j]==a[i]+k){
				if(!solve(a,k,start+1,i-1) && !solve(a,k,i+1,j-1)){
					int n=solve(a,k,j+1,end);
					if(res>n){
						res=n;
					}
				}
			}
		}
	}
	return res;
}

int main(){
	vector<int> a={-1,2,5,8,2,5};
    int k=3;
	
	cout<<solve(a,k,0,a.size()-1);
		
}
