package Blind;

public class MaxSubArr {


//    int maxSum(int[] arr){
//        int max = arr[0];
//        int ovmax = arr[0];
//
//        for(int i=1;i<arr.length;i++){
//            if(arr[i] > 0){
//
//            }
//        }
//
//    }

    int maxSum(int [] arr){
        int csum=-0;
        int maxSum =arr[0];

        for(int i=0;i<arr.length;i++){
            if(csum < 0){
                csum = 0;
            }
            csum = csum + arr[i];
            maxSum = Math.max(maxSum,csum);

        }

       return maxSum;
    }

    public static void main(){

    }

}
