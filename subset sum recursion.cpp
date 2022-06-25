// subset sum equal to  k

#include<bits/stdc++.h>
using namespace std;

bool subsetSum(vector<int> a, int n,int sum){

 if(sum==0)
 return true;
 
 if(n==0){
 	return false;
 }	
 
 if(a[n-1]>sum)
 return subsetSum(a,n-1,sum);
	
 bool  include= subsetSum(a,n-1,sum-a[n-1]);
 bool exclude=subsetSum(a,n-1,sum);
 return include || exclude;	
  	 
}

int main(){
	
	vector<int>a ={3,34,4,12,5,2};
	int n=a.size();
	bool check=subsetSum(a,n,30);
	
	cout<<check;
	
}
