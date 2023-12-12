package Daily;

public class Transpose {


    public int[][] transpose2(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        int[][] ans = new int [col][row];

        for(int i=0;i<col;i++){

            for(int j=0; j<row;j++){

                ans[i][j] = matrix[j][i];
            }
        }
        return ans;
    }

    public static int[][] transpose(int[][] matrix) {


        for(int i=0;i<matrix.length;i++){
            for(int j=i+1;j<matrix[0].length;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        return matrix;
    }

    public static void main(String[] args){

        // test code here


        // test transpose 2


    }

}
