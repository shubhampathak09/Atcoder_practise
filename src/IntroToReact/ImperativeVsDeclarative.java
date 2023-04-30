package IntroToReact;

import java.util.stream.IntStream;

public class ImperativeVsDeclarative {

    public static void main(String[] args){




        int sumOfEvens=0;

        for(int i =0;i<= 100;i++){
            if( i % 2 == 0){
                sumOfEvens+=i;
            }else{

            }
        }
        int sumOfEvens2=0;

        System.out.println(sumOfEvens);
        sumOfEvens2=IntStream.rangeClosed(0,100).filter( i -> i % 2 == 0)
                .reduce((x,y) -> x+y)
                .getAsInt();
    // creates integer stream from 0 to 100

        System.out.println(sumOfEvens2);
    }

    // Declarative  function pm


}
