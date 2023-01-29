package streams;

import java.net.Inet4Address;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class findFirstOdd {
    public static void main(String[] args){
        int[] arr={2,6,7,1,0,9,10,0,3};


        int oddOrMin= Stream.of(arr)
                .flatMapToInt(Arrays::stream)
                .filter(i -> i % 2 !=0)
                .findFirst()
                .orElse(Integer.MIN_VALUE);
/*
        List<Integer> lis=Stream.of(arr)
                        .flatMapToInt(Arrays::stream)
                                .filter(o -> o % 2!=0)
                                        .collect(Collectors.toList());
  */
        List<Integer>lis=Arrays.asList(2,2,4,8,1,3,13,5,6,9,10).stream().filter(o -> o % 2!=0).collect(Collectors.toList());
        System.out.println(lis);
        System.out.println(oddOrMin);
    }
}
