package Daily;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KLargest {

    public static void main(String[] args){

        //int n;
        int[] arr ={10,101,23,44,66,3,92,34,35};

        // int n=5;

        int k =5 ;  //  92,101,66,44

        PriorityQueue<Integer>pq = new PriorityQueue<>();

        for(int i=0;i< arr.length;i++){
            if(i<k){
                pq.add(arr[i]);
            }else {

                if(pq.peek() < arr[i]) {
                    pq.remove();
                    pq.add(arr[i]);
                }

            }        }


       while(!pq.isEmpty()){
           System.out.println(pq.poll());
       }


    }
}
