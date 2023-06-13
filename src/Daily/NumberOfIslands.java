package Daily;

public class NumberOfIslands {

    public static void callBFS(char[][] grid,int i,int j)
    {
        if( i < 0 || i >= grid[i].length|| j< 0 || j>=grid[0].length || grid[i][j]==0)
            return;


        grid[i][j] ='0';
        callBFS(grid,i+1,j);
        callBFS(grid,i-1,j);
        callBFS(grid,i,j+1); //right
        callBFS(grid,i,j-1);
    }
    public static int numOfIslands(char[][]grid){
        int count =0;

        for(int i =0; i< grid.length;i++){
            for(int j=0 ;j<grid[0].length ;j++){
                if(grid[i][j] == '1'){
                    count+=1;
                    callBFS(grid,i,j);
                }
            }
        }
     return count;
    }

    public static void main(String[] args){

    }

}
