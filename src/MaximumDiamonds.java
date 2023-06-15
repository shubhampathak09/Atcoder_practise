import java.util.Collections;
import java.util.PriorityQueue;

public class MaximumDiamonds {

    public static void main(String[] args){


        int k =3;

        int n= 5;

        int[] arr = {2,1,7,4,2};

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());


        for(int i =0 ;i< arr.length ;i++)
            pq.add(arr[i]);

        int count =0;
        int profit =0;
        while(count < k){
            int element =pq.poll();
            profit +=element;
            count =count +1;
            pq.add(element/2);
        }
        System.out.println(profit);

    }

}
