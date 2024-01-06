package LeetCodeDaily;

import scala.Int;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FindTheDifferenecOfTwoArrays {


    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        HashSet<Integer> val1 = new HashSet<>();
        HashSet<Integer> val2 =  new HashSet<>();

        for(int   i : nums1)
            val1.add(i);


        for( int i : nums2)
            val2.add(i);

        HashSet<Integer>ans1 = new HashSet<>();

        for(int i : nums1)
        {
            if(val2.contains(i) == false){
                ans1.add(i);
            }
        }

        HashSet<Integer>ans2 = new HashSet<>();

        for(int i : nums2){
            if(val1.contains(i) == false){
                ans2.add(i);
            }
        }

        return Arrays.asList(new ArrayList<>(ans1),new ArrayList<>(ans2));

    }

    public static void main(String[] args){

    }

}
