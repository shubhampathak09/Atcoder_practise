#include<bits/stdc++.h>
using namespace std;

int main(){
	
	vector<int> arr ={1,2,2,6,6,6,6,7,10};
	
	int n=arr.size();
	
	map<int,int> mp;
	
	for(int i=0;i<n;i++){
		
		mp[i]++;
		
		if((mp[i]/n) > 0.25){
			cout<< arr[i];
			return arr[i];
		}
	
	
	}
	return -1;
	
}
