package Microsoft;

import scala.Int;
import scala.jdk.FunctionWrappers;

import java.util.ArrayList;
import java.util.Arrays;

public class FindMissingObservations {
    public static int[] missingRolls(int[] rolls, int mean, int n) {

      //  return new int[]{2,3,4};

        int sum =(rolls.length + n )*mean ; // (n + rolls.length) *mean
        int  missum = sum - Arrays.stream(rolls).sum();
        int [] ans=new int[n];
        Arrays.fill(ans,missum/n);
        missum =missum % n;
        for(int i=0;i<missum ;i++){
            ans[i]=ans[i]+1;
        }
        return ans;
    }

    public static ArrayList<Integer> findArray(int S, int n,ArrayList<Integer>result)
    {
        if(S==0){
            return result;
        }
        return result;
    }
    public static void main(String[] args){
      int[] rolls={3,2,4,3};
      int mean=4;
      int n=2;
      int m=rolls.length;
      int[] result=missingRolls(rolls,mean,2);
      for(int i=0;i<result.length;i++)
      {
          System.out.print(result[i]+" ");
      }
//      12 + s / 2 + 4  =   12 +s / 6  = 4
//
//              12 +s =24
//
//                 s=12
//                 int arr= {6,6};
//                 int arr = 5,3

     //   [S into n using 1 to 6]


    }
}
