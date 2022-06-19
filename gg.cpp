[["5","3","1","2","7","6","9","4","8"],
 ["6","4","3","1","9","5","8","2","7"],
 ["1","9","8","3","4","7","5","6","2"],
 ["8","1","9","7","6","2","4","5","3"],
 ["4","7","2","8","5","3","6","9","1"],
 ["7","5","4","9","2","8","3","1","6"],
 ["9","6","7","5","3","1","2","8","4"],
 ["2","8","6","4","1","9","7","3","5"],
 ["3","2","5","6","8","4","1","7","9"]]
 
  
  
class Solution {
public:
    
    
    bool isSafe(vector<vector<char>>&board,int i,int j,char no){
        
        
        for(int k=0;k<9;k++){
            if(board[k][j]==no || board[i][k]==no)
                return false;
        }
        
        
        // chceck 3  *3 subgrid
        
         	int sx=(i/3) * 3;
	        int sy=(j/3) * 3;
	        for(int x=sx;x<sx+3;x++){
		     for(int y=sy;y<sy+3;y++){
			  if(board[sx][sy]==no)
			   return false;
		}
	}
        
        return true;
    }
    
    bool solveSudokuUtil(vector<vector<char>>&board,int i,int j)
    {
        if(i==9){
            return true;
        }
        
        if(j==9){
            return solveSudokuUtil(board,i+1,0);
        }
        
        if(board[i][j]!='.')
            return solveSudokuUtil(board,i,j+1);
        
        for(char no='1';no<='9';no++){
            
            
            if(isSafe(board,i,j,no)){
                
                board[i][j]=no;
                
                bool solve=solveSudokuUtil(board,i,j+1);
                if(solve==true)
                {
                    return true;
                }
                
            }
            
        }
        board[i][j]='.';
        return false;
    }
    void solveSudoku(vector<vector<char>>& board) {
        
        int n=board.size();
        int m=board[0].size();
        
         solveSudokuUtil(board,0,0);
        
        
    }
};  
