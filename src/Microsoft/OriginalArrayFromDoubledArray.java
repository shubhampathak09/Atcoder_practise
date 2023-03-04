package Microsoft;

import scala.Int;

import java.util.*;

public class OriginalArrayFromDoubledArray {
    public static int[] findOriginalArray(int[] changed){
        List<Integer> ans=new ArrayList<>();
        Queue<Integer> q=new ArrayDeque<>();
        Arrays.sort(changed);
        for(final int num : changed){
            if(!q.isEmpty() && num==q.peek()){
                q.poll();
            }else
            {
                q.offer(num * 2);
                ans.add(num);
            }
        }
        return q.isEmpty() ? ans.stream().mapToInt(Integer::intValue).toArray():new int[] {};
    }
    public static void main(String[] args){
        int [] changed =findOriginalArray(new int[] {1,3,4,2,6,8});

        for(int i=0;i<changed.length;i++){
            System.out.print(changed[i]+" ");
        }
    }
}
