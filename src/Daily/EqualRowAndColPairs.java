package Daily;

import java.util.HashSet;
import java.util.Set;

public class EqualRowAndColPairs {

    public int equalPairs(int[][] grid){

       Set<int[]> s= new HashSet<>();

       int ans =0;

       for(int i=0;i<grid.length;i++){
           // add rows
           s.add(grid[i]);
       }

       for(int i =0 ;i< grid[0].length;i++){
           // first col
           int [] temp = new int[grid[0].length]
;           for(int j=0;j< grid.length ;i++){
              temp[j] = grid[i][j];
           }
           if(s.contains(temp)){
               ans++;
           }
       }



        return ans;
    }

    public static void main(String[] args){

        int[][] grid = {{3,2,1},{1,7,6},{2,7,7}};

        int[] temp =grid[0];

        for(int i=0;i<temp.length ;i++){
            System.out.println(temp[i]);
        }

        // test here
    }

}
