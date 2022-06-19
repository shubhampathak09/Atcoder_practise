#include<bits/stdc++.h>
using namespace std;

// buy sell stock infinite transactions allowed


int maxProfit(vector<int>profit,int n){
	
	int bd=0;
	int sd=0;
	int profitT=0;
	
	for(int i=0;i<n;i++){
		
		// check for case i=0 since i-1 is not possible in that case
		if(arr[i]>=arr[i-1]){
			sd++;
		}else
		{
			profitT+= profit[sd] -profit[bd];
			sd=bd=i;
		}
		
	}
	
	cout<<profitT;
}


int main(){
	
	
	
	
}
