package beginner;

import java.util.ArrayList;
import java.util.Scanner;

public class Candies {


    public static  void main(String[] args){

        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        ArrayList<Integer>arr=new ArrayList<>();
      //  n=s.nextInt();

        while(n>0){
            int x=s.nextInt();
            arr.add(x);
            n--;
        }

        int a=s.nextInt();
        int b=s.nextInt();
        int sum=0;
        for(int i=a;i<=b;i++){
            sum+=arr.get(i);
        }
        System.out.println(sum);

    }
}
