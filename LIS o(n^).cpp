class Solution {
public:
    int lengthOfLIS(vector<int>& nums) {
     
        vector<int> lis(nums.size());
        
        int maxLis=0;
        
        for(int i=0;i<nums.size();i++){
            
            int mx=0;
            
            for(int j=0;j<i;j++){
                
                if(nums[j]<nums[i]){
                    
                    
                    if(lis[j]>mx){
                        mx=lis[j];
                    }
                }
              
            }
              lis[i]=1+mx;
              if(maxLis<lis[i])
                  maxLis=lis[i];
        }
        
        return maxLis;
        
    }
};
