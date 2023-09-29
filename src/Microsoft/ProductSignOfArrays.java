package Microsoft;

public class ProductSignOfArrays {

    public int arraySign(int[] nums) {

        int prd=1;

        int cntP =0;
        int cntN =0;

        for(int i=0;i<nums.length;i++){
          if(nums[i]==0)
              return 0;
          else if(nums[i] > 0){
              cntP++;
          }else
          {
              cntN--;
          }
        }
       if(cntN % 2 != 0){
           return -1;
       }else
           return 1;
    }


    public static void main(String[] args){

    }

}
