class Solution {
public:
    
    void dfs(int i,vector<vector<int>>g,vector<int>&visited,int count){
        
        visited[i]=true;
        for(auto x: g[i]){
            if(!visited[x]){
                dfs(x,g,visited,count+1);
            }
        }
        
        
    }
    
    int findCircleNum(vector<vector<int>>& isConnected) {
        
        int n=isConnected.size();
        
        
        vector<vector<int>>g(n+1);
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(isConnected[i][j] && i !=j)
                {
                    g[i+1].push_back(j+1);
                    g[j+1].push_back(i+1);
                }
            }
            
        }
        
        vector<int>visited(n+1,0);
        int total=0;
        for(int i=1;i<=n;i++){
            if(visited[i]==false){
                int count=1;
                dfs(i,g,visited,count);
                total+=count;
            }
        }
        
        return total;
    }
};
