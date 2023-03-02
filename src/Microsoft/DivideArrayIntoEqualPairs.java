package Microsoft;

import java.util.HashMap;

public class DivideArrayIntoEqualPairs {
    public static boolean divideArray(int[] nums) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        for(Integer x : hm.keySet()){
            if(hm.get(x) % 2 !=0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        int[] nums = {1,2,3,4};
        boolean canbeDivided=divideArray(nums);
        System.out.println(canbeDivided);
    }
}
