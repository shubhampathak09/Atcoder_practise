package Daily;

import java.util.Arrays;

public class TwoSum {

    // sorted aaray only

    public static void main(String[] args){
        int[] nums ={2,7,11,15 };

        Arrays.sort(nums);

        int i =0;

        int j = nums.length-1;

        int target =9;

        while(i <=j){


            if(nums[i] + nums[j] ==target){
                System.out.println(" " + i + " " +j);
                return;
            }else if(nums[i] + nums[j] < target){
                i++;
            }else{
                j--;
            }
        }
        System.out.println("target sum does not exist");
    }

}
