package Daily;

public class MaxArraySum {

    public static void main(String[] args){

        int arr[] ={-1,2,3,4,-2,6,-8,3};

        int n= arr.length;

        int currSum =0;

        int maxSum =0;

        for(int i =0 ;i< n;i++){

            if(currSum < 0){
                currSum=arr[i];
            }else{
                currSum = currSum + arr[i];
            }
            if(currSum>maxSum)
                maxSum=currSum;


        }

        System.out.println(maxSum);
    }

}
