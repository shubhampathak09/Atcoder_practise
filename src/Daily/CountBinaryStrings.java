package Daily;

public class CountBinaryStrings {

    public static void main(String[] args){

        // should have no consecutive zeros

     int n=6;

     int endZero =1 ;

     int endOne =1;


     for(int i=2 ;i<=n;i++){

         int newEndOne= endZero + endOne;
         int newEndZero = endOne;

         endZero =newEndZero;
         endOne =newEndOne;

     }
        System.out.println(endZero + endOne);

    }

}
