package Algorithms;

import scala.Int;

import java.util.Collections;
import java.util.PriorityQueue;

public class MedianRunningStream {
    /** optimised appraoch using heaps asked in nvidia **/

    public static PriorityQueue<Integer> left=new PriorityQueue(Collections.reverse());
    public static PriorityQueue<Integer> right =new PriorityQueue();

    public static void add(int val){
        if(right.size()>0 && val> right.peek())
            right.add(val);
        else
            left.add(val);

        if(left.size()- right.size()==2){
            right.add(left.remove());
        }else if(right.size()- left.size()==2){
            left.add(right.remove());
        }
    }

    public static int remove(){

        if(size()==0)
        {
            System.out.println("Cant Remove empty heap, since no elements are present in stream");
            return -1;
        }
        if(left.size()>=right.size()){
            return left.remove();
        }else
        {
            return right.remove();
        }

    }
    public static int getMedian(){

        if(size()==0){
            System.out.println("Cant Retrieve from empty heap, since no elements are present in stream");
            return -1;
        }

        if(left.size()>=right.size()){
            return left.peek();
        }else {
            return right.peek();
        }
    }
    public static int size(){
     return left.size()+right.size();
    }
    public static void main(String[]args){

    }


}
