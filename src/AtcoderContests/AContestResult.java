package AtcoderContests;

import java.util.Scanner;

public class AContestResult {
    /**https://atcoder.jp/contests/abc290/tasks/abc290_a**/
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        int sum=0;
        for(int i=1;i<=m;i++){
            int x=s.nextInt();
            sum+=a[x-1];
        }
        System.out.println(sum);
    }
}
