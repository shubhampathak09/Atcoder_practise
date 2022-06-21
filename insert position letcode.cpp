class Solution {
public:
    int searchInsert(vector<int>& nums, int target) {
        
        // if you find mid while binary search great, if you dont the index req to insert will be low+1 or high+1, low and high lying in that part of subarray where the search was terminated and anyways low becomes equal to high always as terminating condition.
        
        int low=0;
        int high=nums.size()-1;
        
        while(low<=high){
            
            int mid=(low) + (high-low)/2;
            
            if(nums[mid]==target){
                
                return mid;
                
                
            }else if(nums[mid]<target){
                low=mid+1;
                
            }
            else  // nums[mid] >target
            {
               
                high=mid-1;
            }
            
            
            
            
        }
        
        return high+1;
    }
};
