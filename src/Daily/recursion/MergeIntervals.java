package Daily.recursion;

import scala.Int;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

public class MergeIntervals {

    public static class Interval{
        int start,end;
        Interval(int start,int end){
         this.start=start;
         this.end =end;
        }


        public static void mergeIntervals(Interval[] arr){

            Stack<Interval>stack = new Stack<>();

            Arrays.sort(arr, new Comparator<Interval>() {
                @Override
                public int compare(Interval o1, Interval o2) {
                    return o1.start -o2.start;
                }
            });


            stack.push(arr[0]);

            for(int i=1;i<arr.length;i++){

                Interval top =stack.peek();

                if(top.end < arr[i].start){
                    stack.push(arr[i]);
                }
                else if( top.end < arr[i].end){
                    top.end =arr[i].end;
                    stack.pop();
                    stack.push(top);
                }
            }
            while (!stack.isEmpty()){
                Interval t = stack.pop();
                System.out.println(" "+ t.start +" "+t.end);
            }



        }

    }

    public static void main(String[] args){


    }

}
