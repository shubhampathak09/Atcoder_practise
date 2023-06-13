package Daily;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static void main(String[] args){

        int[] nums ={1,2,3,2};

        int n=nums.length;

        Set<Integer> set=new HashSet<Integer>();

        for(int i =0; i< n ;i++){
            if(set.contains(nums[i])){
                System.out.println("duplicate");
                return;
            }
            set.add(nums[i]);
        }
        System.out.println("no duplicate");
    }


}
