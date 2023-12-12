package Daily;

public class FindSpecialInteger {

    public static int findSpecialInteger(int [] arr){
        int l=arr.length;
        int qtr = arr.length/4;
        int a = arr[0];

        int cnt = 1;
        for(int i=1;i<arr.length;i++){
            if(a == arr[i])
                cnt++;
            else cnt =1;
            if(cnt > qtr) return arr[i];

            a = arr[i];

        }
        return -1;
    }

    public static void main(String[] args){

        int [] arr = {1,2,2,6,6,6,6,7,10};

        int l=arr.length;

        int ans = findSpecialInteger(arr);

        System.out.println(ans);

    }

}
