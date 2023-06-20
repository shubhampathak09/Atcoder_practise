package Daily;

public class MaxSumNonAdjacents {

    public static void main(String[] args){
        int n=7;
        int[] arr ={};
        n=arr.length;
        int inc =arr[0];
        int exc = 0;

        for(int i=1;i<n;i++){
            int newInc = exc +arr[i];
            int newExc = Math.max(inc,exc);
            inc=newInc;
            exc=newExc;
        }

        System.out.println(Math.max(inc,exc));
    }

}
