package Daily;

import java.util.Collections;
import java.util.PriorityQueue;

public class KSmallestElements {


    public static void main(String[] args){


        int[] arr = {3,4,5,1,2,19,3,4};

        int k =5;

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());   // max heap


        for(int i =0 ;i< arr.length ;i++){
            pq.add(arr[i]);

            if(pq.size() > k){
                pq.poll();
            }
        }

     //   System.out.println(pq.size());

        while(!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.poll();
        }

    }

}
