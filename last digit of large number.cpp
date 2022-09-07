#include<bits/stdc++.h>
using namespace std;

void solve(int n1,int n2){
	
	map<int,vector<int>>mp;
	
	mp[0]={0};
	mp[1]={1};
	mp[2]={6,2,4,8};
	mp[3]={1,3,9,7};
	mp[4]={6,4,8};
	mp[5]={5};
	mp[6]={6};
	mp[7]={1,7,9,3};
	mp[8]={6,8,4,2};
	mp[9]={1,9};
	
	int lastDig=n1 % 10;
	int cycle=mp[lastDig].size();
	int index= n2 % cycle;
	int reqVal=mp[lastDig][index];
	cout<<"The last digit in power function is.."<<reqVal;
}

int main(){
	
	solve(29,157);
}
