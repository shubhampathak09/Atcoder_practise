//https://www.codewars.com/kata/58e77c88fd2d893a77000102/train/python
// burst ballons
/*
Input: nums = [3,1,5,8]
Output: 167
Explanation:
nums = [3,1,5,8] --> [3,5,8] --> [3,8] --> [8] --> []
coins =  3*1*5    +   3*5*8   +  1*3*8  + 1*8*1 = 167
*/

#include<bits/stdc++.h>
using namespace std;

vector<vector<int>>dp(100,vector<int>(100,-1));

int solve(vector<int>ballons,int i,int j){
	
	if(i>j)
	return 0;
	
	if(dp[i][j]!=-1)
	return dp[i][j];
	
	int ans=INT_MIN;
	for(int index=i;index<=j;index++){
		
		
	 
		int cost= ballons[i-1] * ballons[index]*ballons[j+1] + solve(ballons,i,index-1) +solve(ballons,index+1,j);
	    ans=max(ans,cost); 	
		
	}
	
	return dp[i][j]=ans;
}

int main(){
	
	vector<int> ballons={3,1,5,8};
	ballons.push_back(1);
	ballons.insert(ballons.begin(),1);
	
	for(auto x: ballons){
		cout<<x<<" ";
	}
	
	int n=ballons.size();
	
	
	int anss=solve(ballons,1,n-2);
	cout<<endl;
	cout<<"cost of bursting ballons.."<<anss;
}
