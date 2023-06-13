package Daily;

import java.util.PriorityQueue;

public class KLargestElements {

    public static void main(String[] args){

        int[] arr = {3,4,5,1,2,19,3,4};

        int k =5;


        PriorityQueue priorityQueue = new PriorityQueue<>();


        for(int i=0;i<arr.length;i++){
            priorityQueue.add(arr[i]);

            if(priorityQueue.size() >  k){
                    priorityQueue.poll();
            }

        }

        while(!priorityQueue.isEmpty()){
            System.out.println(priorityQueue.peek());
            priorityQueue.poll();
        }
    }

}
