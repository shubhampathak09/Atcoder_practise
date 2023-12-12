package Daily;

import Daily.recursion.MergeIntervals;

import java.util.Arrays;

public class MaximiseProductOfTwo {

    public static int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int l = nums.length;
        return (nums[l-1] -1) * (nums[l-2] -1);
    }


    public static int optimisedMaxProduct(int[] nums){

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for(int num : nums){
            if(num >= max1){
                max2 = max1;
                max1 = num;
            } else if(num >max2){
                max2 = num;
            }
        }
        return (max1-1) *(max2 -1);
    }

    public static void main(String[] args){

        int nums[]={3,4,5,2};

        int ans = maxProduct(nums);
        int ans2 = optimisedMaxProduct(nums);
        System.out.println(ans2);

    }

}
