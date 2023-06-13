package Daily;

public class BestTimeBuySellStock2 {


    public static void main(String[] args){

        int n=6;

        int[] arr = new int[n];

        for(int i=0; i<n ;i++){
            // initalise array
        }

        int bd=0;
        int sd=-0;

        int profit =0;

        for(int i =1 ;i<n;i++){
            if(arr[i] >= arr[i-1]){
                sd++;
            }else
            {
                profit += arr[sd] -arr[bd];
                bd= sd =i;
            }
        }
        System.out.println(profit);
    }

}
