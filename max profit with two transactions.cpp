// buy and sell stocks  2 tranactions allowed

#include<bits/stdc++.h>
using namespace  std;


int maxProfit(vector<int> profit,int n){
	
	
	int mpist=0;
	int leastsf=profit[0];
	cout<<leastsf;
	vector<int> dp1(n,0);
	vector<int> dp2(n,0);
	//dp1[0]=0;
	for(int i=1;i<n;i++){
		
		
		if(leastsf>profit[i]){
			leastsf=profit[i];
		}
		mpist=profit[i]-leastsf;
		if(mpist>dp1[i-1]){
			dp1[i]=mpist;
		}else
		dp1[i]=dp1[i-1];
	}
	
	// right to left
	
	int maxpibt=0;
	int maxat=profit[profit.size()-1];
	
	for(int i=n-2;i>=0;i--){
		
		
		if(profit[i]>maxat)
		{
			maxat=profit[i];
		}
		maxpibt=maxat-profit[i];
		if(maxpibt > dp2[i-1]){
			dp2[i]=maxpibt;
		}
		else 
		dp2[i]=dp2[i-1];
	}
	
	int anss=0;
	for(int i=0;i<n;i++){
		cout<<anss<<endl;
		cout<<dp1[i] + dp2[i]<<endl;
		anss=max(anss,dp1[i]+dp2[i]);
	}
	
	return anss;
}

int main(){
	
	
	int n;
	vector<int> profit={3,3,5,0,0,3,1,4};
	n=profit.size();
	
	int ans=maxProfit(profit, n);
	
	cout<<ans;
	
	
}
