#include<bits/stdc++.h>
using namespace std;

// buy sell stock infinite transactions allowed


int maxProfit(vector<int>profit,int n){
	
	int bd=0;
	int sd=0;
	int profitT=0;
	bool checkDip=false;
	for(int i=1;i<n;i++){
		
		// check for case i=0 since i-1 is not possible in that case
		if(profit[i]>=profit[i-1]){
			sd++;
		}else
		{
			checkDip=true;
			cout<<profit[sd]-profit[bd]<<endl;
			profitT+= profit[sd] -profit[bd];
			sd=bd=i;
		}
		
	}
	profitT+=profit[sd] -profit[bd]; 
//	cout<<profitT;
	return profitT;
}


int main(){
	
	
	vector<int>profit={6,1,3,2,4,7};
	
	int n=profit.size();
	
	cout<<maxProfit(profit,n);
	
}
