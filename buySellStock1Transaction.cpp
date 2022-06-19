// buy sell stock one transaction allowed
#include<bits/stdc++.h>
using namespace std;
int main(){
	
	int n=9;
	
	int prices[n]={11,6,7,19,4,1,6,18,4};
	
	
	int leastSoFar=INT_MAX;
		
	int oProfit=0;
	int pToday=0;	
		
	for(int i=0;i<n;i++){
		
		if(prices[i]<leastSoFar){
		    leastSoFar=prices[i];
		}
		
		pToday=prices[i]-leastSoFar;
	//	cout<<pToday<<endl;
		if(pToday>oProfit){
			oProfit=pToday;
		}
		
	}	
	
	cout<<oProfit;	
	
}
