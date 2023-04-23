#include<bits/stdc++.h>
using namespace std;

int main(){
	
	int nums[]={};
	int n=sizeof(nums)/sizeof(nums[0]);
	int len=n-1; //goal
    int goal=len;
	for(int i=len ;i >=0;i--){
		if(i + nums[i] > goal){
			goal= i;
		}
	}
	if(goal == 0){
		cout<<"true";
	}else
	{
		cout<<"false";
	}
}
