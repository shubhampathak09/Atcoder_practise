class Solution {
public:
    int findNumberOfLIS(vector<int>& nums) {
        
        vector<int>  lis(nums.size());
        int ovmax=0;
        int oi=-1;
        for(int i=0;  i<nums.size() ;i++){
            
            int mx=0;
            
            for(int j=0 ;j< i ;j++){
                
                if(nums[j]<nums[i] ){
                    
                    if(lis[j] > mx){
                        mx=lis[j];
                    }
                    
                }
                
            }
            lis[i]=mx+1;
            if(lis[i] > ovmax){
                ovmax=lis[i];
                oi=i;
            }
        }
        int count=0;
        queue<pair<int,int>>q;
        
        for(int i=0;i<nums.size();i++){
            if(lis[i]==ovmax)
            {
                q.push({lis[i],i});
            }
        }
        
   //     q.push({ovmax,oi});
       
        while(!q.empty()){
            
            
            
            auto x=q.front();
            if(x.first==1){
                count++;
            }
            q.pop();
            int lislen=x.first;
            int lisind=x.second;
            
            for(int j=0;j<lisind;j++){
                if(lis[j]==lislen-1 && nums[j]<=nums[lisind]){
                    q.push({lis[j],j});
                }
            }
        }
        
        return count;
    }
};
