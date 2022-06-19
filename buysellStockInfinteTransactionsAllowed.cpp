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
			profitT+= profit[sd] -profit[bd];
			sd=bd=i;
		}
		
	}
	
	if(checkDip==false)
	{
		return profit[n-1] -profit[0];
	}
//	cout<<profitT;
	return profitT;
}


int main(){
	
	
	vector<int>profit={1,2,3,4,5,6};
	
	int n=profit.size();
	
	cout<<maxProfit(profit,n);
	
}
