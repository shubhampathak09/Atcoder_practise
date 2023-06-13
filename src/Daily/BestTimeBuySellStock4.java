package Daily;

import java.util.Scanner;

public class BestTimeBuySellStock4 {
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();

        int[] arr = new int[n];
        for(int i =0 ;i< n ;i++){
            arr[i]=scn.nextInt();
        }


        int obsp=-arr[0];
        int ossp =0;
        int ocsp=0;

        for(int i=1;i<n;i++){
           int nbsp =0;
           int nssp =0;
           int ncsp=0;

           if(ocsp - arr[i] >  obsp){
               nbsp = ocsp -arr[i];
           }else
           {
               nbsp =obsp;
           }

           if(arr[i] + obsp > ossp){
               nssp = arr[i] + obsp;
           }else
           {
               nssp = ossp;
           }

           if( ossp > ocsp){
               ncsp =ossp;
           }else {
               ncsp =ocsp;
           }
           obsp =nbsp;
           ossp =nssp;
           ocsp =ncsp;

        }

        System.out.println(ossp);


        // int n=12

        // 10  15
        // 17 20
        // 16 18
        // 22 20
        // 22 20
        // 23 25

    }
}
