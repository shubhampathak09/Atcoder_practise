package Blind;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {


    boolean containsDup(int[] nums){

        Set<Integer>hs = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(hs.contains(nums[i])){
                return true;
            }else
            {
                hs.add(nums[i]);
            }
        }
        return false;
    }

    public static void main(String[] args){

    }

}
