#include<bits/stdc++.h>
using namespace std;



vector<int> sortedSquares(vector<int>&nums){
	
	vector<int>result;
	
	for(int i=0;i<nums.size();i++){
		result.push_back(nums[i]*nums[i]);
	}
	
	sort(result.begin(),result.end());
	
	return result;
}

int main(){
	
	vector<int> nums = {-7,-3,2,3,11};
	
	vector<int> ans = sortedSquares(nums);
	
	for(int i=0;i<ans.size();i++){
		cout<<ans[i]<<" ";
	}
	
	
}





/*

class Solution {
public:
    vector<int> sortedSquares(vector<int>& nums) {
        int n = nums.size();
        int s=0,e=n-1;
        vector<int>ans(n);
        for(int i =n-1;i>=0;i--){
            if(abs(nums[s])>=abs(nums[e])){
                ans[i] = nums[s]*nums[s];
                s++;
            }else{
                ans[i] = nums[e]*nums[e];
                e--;
            }
        }
        return ans;
    }
};

*/

// asked to me in paytm interview


