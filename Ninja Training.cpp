/*
Ninja is planing this ‘N’ days-long training schedule. Each day, he can perform any one of these three activities. (Running, Fighting Practice or Learning New Moves).
 Each activity has some merit points on each day. 
 As Ninja has to improve all his skills, he can’t do the same activity in two consecutive days. 
 Can you help Ninja find out the maximum merit points Ninja can earn?
You are given a 2D array of size N*3 ‘POINTS’ with the points corresponding to each day and activity. 
Your task is to calculate the maximum number of merit points that Ninja can earn.
*/


#include<bits/stdc++.h>
using namespace  std;

vector<vector<int>>dp(100,vector<int>(100,-1));

int solve(int days,int tasks,int last,vector<vector<int>>points){
if(days==0){
	int maxi=0;
	for(int k=0;k<tasks;k++){
		if(k!=last)
		maxi=max(maxi,points[days][k]);
	}
	return maxi;
}	
if(dp[days][last]!=-1)
return dp[days][last];

int maxi=0;

for(int k=0;k<tasks;k++){
	if(k!=last){
		int pointsSum=0;
		if(dp[days-1][last]!=-1)
		 pointsSum=points[days][k] + dp[days-1][last];
		else
		 pointsSum= points[days][k] + solve(days-1,tasks,k,points);
		maxi=max(maxi,pointsSum);
	}
}
return dp[days][last]=maxi;	
}

int main(){
	
vector<vector<int>>points={{1,2,5},{3,1,1},{3,3,3}};

int days=points.size();
int tasks=points[0].size();
int last=tasks;

//vector<vector<int>>dp(days,vector<int>(tasks,-1));

cout<<solve(days-1,tasks,last,points);	
	
}
