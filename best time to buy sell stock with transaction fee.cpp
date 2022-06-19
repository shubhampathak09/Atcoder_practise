// buy sell stocks infi transactions and some transsaction fee

#include<bits/stdc++.h>
using namespace std;



int maxProfit(vector<int> profit,int n){
	
	int fee=2;
	
	
	int bs=-1*profit[0];
	int ss=0;
	
	for(int i=1;i<n;i++){
		
		
		int nbp=0;
		int nsp=0;
		
		if(ss - profit[i]>bs){
			nbp=ss-profit[i];
		}
		else
		{
			nbp=bs;
		}
		
		if(profit[i]+bs-fee > ss){
			nsp=profit[i] +bs -fee;
		}
		else
		nsp=ss;
		
		
		bs=nbp;
		ss=nsp;
		
	}
	
	return ss;
}

int main(){
	
	vector<int> prices={1,3,2,8,4,9};
	
	int n=prices.size();
	
	int ans=maxProfit(prices,n);
	
	cout<<ans;
	
	
}
