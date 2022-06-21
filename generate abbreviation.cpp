class Solution {
public:
    
    
void gen(string s,string ans,int count,int pos,vector<string> & result)

{
	
	if(pos==s.length()){
		if(count==0)
		result.push_back(ans);
		else
		{
		 result.push_back(ans+to_string(count));
		}
		return;
	}
	
	if(count>0)
	gen(s,ans+to_string(count)+s[pos],0,pos+1,result);
	else
	gen(s,ans+s[pos],0,pos+1,result);
	
	gen(s,ans,count+1,pos+1,result);
	
	
}

    
    vector<string> generateAbbreviations(string word) {
        
        vector<string>result;
        string ans="";
        gen(word,ans,0,0,result);
        return result;
        
    }
};
