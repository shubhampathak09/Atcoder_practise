package streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class findFirstOdd {
    public static void main(String[] args){
        int[] arr={2,6,7,1,0,9,10,0,3};


        int oddOrMin= Stream.of(arr)
                .flatMapToInt(Arrays::stream)
                .filter(i -> i % 2 !=0)
                .findFirst()
                .orElse(Integer.MIN_VALUE);

        System.out.println(oddOrMin);
    }
}
