package Microsoft;

import scala.Int;

import java.util.Collections;
import java.util.PriorityQueue;

public class MinOperationsHalfArray {
    /**https://leetcode.com/problems/minimum-operations-to-halve-array-sum/ **/

    public static int halveArray(int[] nums) {
        double sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }

        PriorityQueue<Double>pq= new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<nums.length;i++){
            pq.add((double) nums[i]);
        }

        double runningSum=0;

        int cnt=0;
        while(runningSum < sum/2){
            double maxVal=pq.peek() /2;
            runningSum+=maxVal;
            pq.remove();
            pq.add(maxVal);
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
