package Daily;

import scala.Int;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class IntersectionOfMultipleArrays {

    public static void main(String[] args){
        int[][] nums = {{2,3,4,7,1},{4,1,3,5},{8,4,2,6,2,1},{7,9,4,1}};



        HashSet<Integer> iSet =new HashSet<>(Arrays.stream(nums[0])
                .mapToObj(Integer :: valueOf)
                .collect(Collectors.toList()));

        for(int i=1;i<nums.length;i++){
            HashSet<Integer>cSet = new HashSet<>(Arrays.stream(nums[i])
                    .mapToObj(Integer :: valueOf)
                    .collect(Collectors.toList()));


            iSet.retainAll(cSet);

        }

        System.out.println(iSet);
    }

}
