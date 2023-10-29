package Blind;

import java.util.Arrays;

public class ProdArrSelf {


    public static int[] prodArray(){

        int [] nums = {1,2,3,4};

        int [] res =new int[nums.length];


         Arrays.fill(res,1);

         int pre = 1;
         int post =1;

         for(int i=0;i<nums.length;i++){
             res[i] = pre;
             pre = nums[i] * pre;
         }

         for(int i=nums.length-1;i>=0;i--){
             res[i] = res[i] * post;
             post = post * nums[i];
         }



       // int ans=1;





        return res;
    }

        public static void main(String[] args){

    }

}
