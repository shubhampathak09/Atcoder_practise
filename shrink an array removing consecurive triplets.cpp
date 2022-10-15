//Shrink an array by removing triplets that satisfy given constraints
#include<bits/stdc++.h>
using namespace std;


int solve(vector<int>a,int k,int start,int end){
	
	if(start > end){
		return 0;
	}
	
	int res=0;
	
	res = 1 +solve(a,k,start+1,end); // a[start] does not form a triplet

	for(int i=start+1;i<=end;i++){
		
		
		for(int j = i+1;j <= end;j++){
		
			if(a[i] == a[start] + k && a[j] == a[i] + k){
		        //cout<<i<<j<<endl; 
				if(solve(a,k,start+1,i-1) != 0 && solve(a,k,i+1,j-1) != 0){
		
					int n= solve(a,k,j+1,end);
	               // cout<<n<<endl;	
					if(res > n){
		
						res = n;
					}
				}
			}
		}
	}
	return res;
}

int main(){
	vector<int> a={-1,0,1,2,3,4};
    
	cout<<a.size();
	
	int k=3;
	
	cout<<solve(a,k,0,5);
		
}
