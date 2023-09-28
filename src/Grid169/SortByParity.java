package Grid169;

import java.util.ArrayList;
import java.util.List;

public class SortByParity {
    public static void main(String[] args){
        int[] nums ={3,1,2,4};
        int n = nums.length;
        List<Integer> list=new ArrayList<>();
        for(int i=0 ;i<n;i++){
            if(nums[i] % 2 ==0){
                list.add(nums[i]);
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i] %2 !=0){
                list.add(nums[i]);
            }
        }

        for(Integer x : list){
            System.out.print(x+" ");
        }
    }
}
