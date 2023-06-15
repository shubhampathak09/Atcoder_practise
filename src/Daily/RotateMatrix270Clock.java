package Daily;

public class RotateMatrix270Clock {


    public static void rotateBy90Clockwise(int[][] grid,int n,int m){


        System.out.println("Original Matrix..");

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(grid[i][j] +" ");
            }
            System.out.println();
        }


        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int temp = grid[i][j];
                grid[i][j]=grid[j][i];
                grid[j][i]=temp;
            }
        }

        // reverse all rows
        for(int i=0;i<m;i++){
            int l =0, r = n-1;
            while(l<=r){
                int temp= grid[i][l];
                grid[i][l]=grid[i][r];
                grid[i][r]=temp;
                l++;
                r--;
            }
        }

        System.out.println("Rotate Matrix...");

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(grid[i][j] +" ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args){


        /***
         *
         * [1,2 ,3 ,4
         * [5,6,7,8
         * [9,10,11,12 ]
         *
         *
         * 4  8  12
         *
         * 3 7  11
         *
         * 2 6 10
         *
         * 1 5 9
         *
         *
         *
         */



        int[][] grid ={{1,2,3},{4,5,6},{7,8,9}};

        int m= grid.length;
        int n=grid[0].length;

        int mx = Math.max(m,n);

        rotateBy90Clockwise(grid,mx,mx);


        // 90 * clock wise X 3  -> o(mn)


        // 180 * clock  + 90 * clock

        // approach -> Trn -> reverse cols


        // 0(mn)



    }

}
