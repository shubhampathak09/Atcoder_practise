class Solution {
public:
    bool judgeCircle(string moves) {
        
        pair<int,int> p={0,0};
        
        
        
        for(int i=0;i<moves.length();i++){
            
        if(moves[i]=='U'){
            p.first-=1;
        }  else if(moves[i]=='D'){
            p.first+=1;
        }  else if(moves[i]=='L'){
            p.second-=1;
        }else {
            p.second+=1;
        }
            
        }
        return p.first==0 && p.second==0;
            
        
        
    }
};
