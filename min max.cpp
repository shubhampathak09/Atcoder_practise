#include<bits/stdc++.h>
using namespace std;

//How to change mode from c++98 mode in Dev-C++ to a mode that supports C++0x (range based for)?


int main(){
	vector<int> nums={1,3,4,1};
	
	int mini =nums[0];
	int maxi=nums[0];
	
	for(int i=0;i<nums.size();i++){
		mini = min(mini,nums[i]);
		maxi=  max(maxi,nums[i]);
	}
	cout<<mini + maxi;
	
}
