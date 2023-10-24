package Daily;

import java.util.Collections;
import java.util.PriorityQueue;

public class Heap {

    public static void main(String[] args){
        int[] ranks = {22,99,3,11,88,4,1};
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int val : ranks){
            pq.add(val);
        }

        while(pq.size() > 0){
            System.out.println(pq.peek());
            pq.remove();
        }
    }

}
