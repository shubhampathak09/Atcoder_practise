// house robber 2

#include<bits/stdc++.h>
using namespace std;

int maxSumNonAdjacent(int i,vector<int>num){
	if(i==0)
	return num[0];
	if(i-2<0)
	return 0;
	int pick=num[i] +maxSumNonAdjacent(i-2,num);
	int notPick=maxSumNonAdjacent(i-1,num);
	return max(pick,notPick);
}

int main(){
	
	
	vector<int> num={2,3,2};
	
	 num.insert(num.end(),num.begin(),num.end());
	
//	
//	for(auto x:num)
//	{
//		cout<<x<<" ";
//	}
//	//num=num+num;
	int n=num.size();
	
	int ans=maxSumNonAdjacent(n-1,num);
	
	cout<<ans<<endl;
}
