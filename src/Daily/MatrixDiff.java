package Daily;

public class MatrixDiff {

    public static int[][] onesMinusZeros(int[][] grid) {


        int[] oneRow = new int[grid.length];
        int[] oneCol = new int[grid[0].length];
        int[] zeroRow = new int[grid.length];
        int[] zeroCol = new int[grid[0].length];


        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    oneRow[i] +=1;
                    oneCol[j] +=1;
                }else if(grid[i][j]==0){
                    zeroRow[i] +=1;
                    zeroCol[j] +=1;
                }
            }
        }

        int[][] diffMatrix = new int[grid.length][grid[0].length];

        for(int i=0;i<diffMatrix.length;i++){
            for(int j=0;j<diffMatrix[0].length;j++){
                diffMatrix[i][j] = oneRow[i] +oneCol[j] - zeroRow[i] -zeroCol[j];
                System.out.print(diffMatrix[i][j] +" ");
            }
            System.out.println();
        }



        return diffMatrix;

    }


    public static void main(String[] args){

        int[][] grid ={{0,1,1},{1,0,1},{0,0,1}};

        int[][] ans =onesMinusZeros(grid);


    }

}
