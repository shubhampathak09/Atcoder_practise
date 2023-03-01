package Microsoft;

import scala.Int;

import java.util.Collections;
import java.util.PriorityQueue;

public class MinOperationsHalfArray {
    /**https://leetcode.com/problems/minimum-operations-to-halve-array-sum/ **/

    public static int halveArray(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }

        PriorityQueue<Integer>pq= new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<nums.length;i++){
            pq.add(nums[i]);
        }

        double temp=sum;
        int cnt=0;
        while(temp  > sum/2){
            int x=pq.remove();
            temp = temp - Math.ceil((1.0 * x)/2);
            pq.add(x/2);
            cnt++;
        }
        return cnt;
    }
    public static void main(String[] args){
       int[] nums={5,19,8,1};
       int number=halveArray(nums);
        System.out.println(number);
    }
    /** needs review since some test case fail over lc ** /
     *
     */
}
