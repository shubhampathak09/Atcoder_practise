package Grid169;

public class MaximumSumSubarray {


    public static void main(String[] args){


        int [] arr ={};
        int csum = arr[0];
        int osum = arr[0];

        for(int i = 1 ;i< arr.length ;i++){
            if(csum > 0){
                csum +=arr[i];
            }else
            {
                csum =arr[i];
            }

            if(csum >osum){
                osum =csum;
            }
        }
        System.out.println(osum);
    }
}
