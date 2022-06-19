//buy and sell stock with infinite transactions
// get max profit
#include<bits/stdc++.h>
using namespace std;


int maxProfit(vector<int>profit,int n)
{
	
	int bsp=-1*arr[0];
	int ssp=0;
	int csp=0;
	
	for(int i=1;i<n;i++){
		
		
		int nbsp=0;
		int nssp=0;
		int ncsp=0;
		
		
		if(csp -arr[i]> bsp){
			nbsp=csp-arr[i];
		}
		
		if(arr[i]+bsp > ssp){
			nssp=arr[i]+bsp;
		}else 
		nssp=ssp;
		
		if(ssp > csp){
			ncsp=ssp;
		}else
		    ncsp=csp;
		    
		    
		    bsp=nbsp;
		    ssp=nssp;
		    csp=ncsp;
		    
	}
	
	return ssp;
}
int main(){
	
	vector<int> trs={};
	
	int ans =maxProfit(trs,trs.size());
	
	
	//result
}


