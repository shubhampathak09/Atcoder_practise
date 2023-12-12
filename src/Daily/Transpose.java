package Daily;

public class Transpose {

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


    }

}
