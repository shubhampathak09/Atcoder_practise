class Solution {
public:
    
    void checkExecute(string suffix,int &nI,pair<int,int>currPos,int n)
    {
        
        
        for(int i=0;i<suffix.length();i++){
            
            if(i=='R'){
                if(currPos.second+1>=n)
                    return;
                else
                {
                    currPos.second+=1;
                     
                }
            }
            else if(i=='L'){
                if(currPos.second-1<0)
                    return;
                else
                {
                    currPos.second-=1;
                     
                }
            }else if(i=='U'){
                if(currPos.first-1<0)
                    return;
                else
                {
                    currPos.first-=1;
                     
                }
            }else {
                if(currPos.first+1>=n)
                    return;
                else
                {
                    currPos.first+=1;
                     
                }
            }
            nI++;
        }
        
    }
    vector<int> executeInstructions(int n, vector<int>& startPos, string s) {
        // generate all suffixes
        
        
        vector<int>result;
        
        int m=s.length()-1;
        int i=0;
        int j=m;
        
        while(i<=j){
            string suffix=s.substr(i,j-i+1);
            
            int nI=0;
            
            pair<int,int>start={startPos[0],startPos[1]};
            
            checkExecute(suffix,nI,start,n);
            
            result.push_back(nI);
        }
        
        return result;
    }
};
