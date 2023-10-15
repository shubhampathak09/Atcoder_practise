package Daily;

public class MajorityElement1 {

    static int findElement(int[] arr,int n){
        int count =1;
        int ansIndex=0;

        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]==ansIndex){
                count++;
            }else{
                count--;
            }
            if(count == 0){
                ansIndex=i;
                count=1;
            }
        }
        int ct=0;
        for(int i=0;i<arr.length;i++){
            if(arr[ansIndex]==arr[i]){
                ct++;
            }
        }
        if(ct > arr.length/2){
            System.out.println("Majority ELement is.."+arr[ansIndex]);
            return arr[ansIndex];
        }
      else
          return -1;
    }

    public static void main(String[] args){

        int arr[] = {3, 3, 4, 2, 4, 4, 2, 4, 4};

        int ans=findElement(arr,arr.length);


        System.out.println(ans);

    }

}
