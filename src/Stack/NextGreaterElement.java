package Stack;

import java.util.Stack;

public class NextGreaterElement {

    public static int[] solve(int[] arr){
        int[] nge=new int[arr.length];
        Stack<Integer>st=new Stack<>();
        st.push(arr[arr.length-1]);
        nge[arr.length-1]=-1;
        for(int i=arr.length-2;i>=0;i--){
            while(st.size() > 0 && arr[i] >= st.peek()){
                st.pop();
            }
            if(st.size()==0){
                nge[i]=-1;
            }else{
                nge[i]=st.peek();
            }
            st.push(arr[i]);
        }
        return nge;
    }

    public static void main(String[] args){
        // o(n) solution
        int[] arr= {4,5,2,25};
        int[] result=solve(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(result[i]);
        }
    }
}
