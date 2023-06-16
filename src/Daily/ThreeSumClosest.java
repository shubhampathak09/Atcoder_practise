package Daily;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThreeSumClosest {

    public static void main(String[] args){

      //  List<Integer> arr = new ArrayList<>();

        List<Integer> arr = new ArrayList<>(Arrays.asList(-1,-2,1,4));
//
//        arr.add(-1);
//        arr.add(2);
//        arr.add(1);
//        arr.add(-4);

        Collections.sort(arr);

        int closestSum = Integer.MAX_VALUE;

        int x =1;
        for(int i =0 ;i < arr.size()-2 ;i++)
        {
            int ptr1 = i+1;
            int ptr2 = arr.size() -1;

            while(ptr1 < ptr2){


                int sum = arr.get(i) + arr.get(ptr1) + arr.get(ptr2);

                if(Math.abs(x -sum) < closestSum){
                    closestSum =sum;
                }
                if(sum > x){
                    ptr2--;
                }else
                {
                    ptr1++;
                }

            }
        }
        System.out.println(closestSum);
    }

}
