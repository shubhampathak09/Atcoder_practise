package Daily;

import java.util.Collections;
import java.util.PriorityQueue;

public class MinCostToConnectRopes {

    //   n = 4
    //   arr[] = {4, 3, 2, 6}

    public static void main(String[] args) {

        Integer[] arr = {4, 3, 2, 6};

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
        }
        int totalCost=0;
        while (pq.size()>=2) {
            Integer top1 = pq.poll();
            Integer top2 =pq.poll();
            Integer cost=top1+top2;
            totalCost+=cost;
            pq.add(cost);
        }
        System.out.println("Min cost to connect the ropes is "+ totalCost);
    }
}