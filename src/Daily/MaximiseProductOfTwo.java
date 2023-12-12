package Daily;

import java.util.Arrays;

public class MaximiseProductOfTwo {

    public static int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int l = nums.length;
        return (nums[l-1] -1) * (nums[l-2] -1);
    }

    public static void main(String[] args){

        int nums[]={3,4,5,2};

        int ans = maxProduct(nums);

        System.out.println(ans);

    }

}
