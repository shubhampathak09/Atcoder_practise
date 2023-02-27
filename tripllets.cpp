// triplets
#include<bits/stdc++.h>
using namespace std;

vector<vector<int>>triplets (vector<int> arr,int sum){
	sort(arr.begin(),arr.end());
	// pick every a[i]. solve pair sum
	vector<vector<int>> result;
	int n=arr.size();
	
	for(int i=0;i<=n-3 ;i++){
		
		int j=i+1;
		int k=n-1;
		
		// two pointer approach
		
		while(j<=k){
			int curr_sum=arr[i];
			curr_sum+=arr[j];
			curr_sum+=arr[k];
			if(curr_sum == sum){
				result.push_back({arr[i],arr[j],arr[k]});
				j++;
				k--;
			}else if(curr_sum > sum){
				k--;
			}
			else
			{
				j++;
			}
		}
	}
	return result;
}
int main(){
	vector<int> arr{1,2,3,4,5,6,7,8,9,15};
	int s=18;
	auto result=triplets(arr,s);
	if(result.size()==0)
	{
		cout<<"No triplets exist";
		return 0;
	}
	
	for(auto x : result){
		cout<< x[0]<<" "<<x[1]<<" "<<x[2]<<endl;
	}
}

// expected o/p:- 

/**
1 2 15
1 8 9
2 7 9
2 8 8
3 6 9
3 7 8
4 5 9
4 6 8
4 7 7
5 6 7
**/
