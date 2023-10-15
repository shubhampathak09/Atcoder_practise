package Daily;

import java.util.ArrayList;
import java.util.List;

public class MajorityELement2 {


    public static void main(String[] args) {
        int[] arr = {};
        int n = arr.length;

        int c1 = 0;
        int c2 = 0;
        int nums1 = -1;
        int nums2 = -1;

        for(int i=0;i<arr.length;i++){


            if(arr[i]==nums1){
                c1++;
            }else if (arr[i]==nums2){
                c2++;
            }else if(c1==0){
                nums1=c1;
                c1=1;
            }else if(c2==0){
                nums2=c2;
                c2=1;
            }else{
                c1--;
                c2--;
            }

        }

        List<Integer> result = new ArrayList<>();
        int ct1=0;
        int ct2=0;
        for(int e : arr){
            if(e == nums1){
                ct1++;
            }
            if(e == nums2){
                ct2++;
            }
        }

       if(ct1>arr.length/3){
           result.add(nums1);
       }

       if(ct2> args.length/3){
           result.add(nums2);
       }

    }


}
