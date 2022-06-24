f(ind==n) return 0;
	if(dp[ind]!=-1) return dp[ind];
	int len=0;
	int res=INT_MIN;
	int maxi=INT_MIN;
	for(int i=ind;i<min(ind+k,n);i++){
		len++;
		maxi=max(maxi,arr[i]);
		int sum=(len*maxi)+f(i+1,n,k,arr,dp);

		res=max(res,sum);
	}

	return dp[ind]=res;
}
int maxSumAfterPartitioning(vector<int>& arr, int k) {
	vector<int>dp(arr.size(),-1);
	return f(0,arr.size(),k,arr,dp);
