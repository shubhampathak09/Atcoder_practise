package Daily;

import java.util.Stack;

public class StockSpan {
    public static void main(String[] args){
        int[] arr={};
        int[] span=new int[arr.length];
        Stack<Integer> s=new Stack();
        s.push(0);
        for(int i=1;i<span.length;i++){
            while(!s.empty() && s.peek() <arr[i] ){
                s.pop();
            }
            if(s.size()==0){
                span[i]=i+1;
            }else
            {
                span[i]=i-s.peek();
            }
            s.push(i);
        }
        for(int i=0;i<span.length;i++){
            System.out.println(span[i]);
        }
    }
}
