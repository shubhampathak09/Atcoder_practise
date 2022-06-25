// lis using binary search approach
#include<bits/stdc++.h>
using namespace std;




int main(){
	


vector<int> nums = {10,9,2,5,3,7,101,18};


int n=nums.size();


vector<int>temp;

temp.push_back(nums[0]);
	
for(int i=1;i<n;i++){
	
	
	if(nums[i]>temp.back()){
		temp.push_back(nums[i]);
	}else
	{
		int key=nums[i];
		int index=lower_bound(temp.begin(),temp.end(),key)-temp.begin();
		//cout<<index<<endl;
		temp[index]=nums[i];
		
			}
	
}	

cout<<temp.size();
	 
}
