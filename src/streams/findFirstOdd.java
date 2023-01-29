package streams;

import java.net.Inet4Address;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class findFirstOdd {
    public static void main(String[] args){
        int[] arr={2,6,7,1,0,9,10,0,3};

       /** find first odd from integer array using streams **/
        int oddOrMin= Stream.of(arr)
                .flatMapToInt(Arrays::stream)
                .filter(i -> i % 2 !=0)
                .findFirst()
                .orElse(Integer.MIN_VALUE);


        /**2. group all odd integers together in a list **/
        List<Integer>lis=Arrays.asList(2,2,4,8,1,3,13,5,6,9,10,13,17,19,100,101,4).stream().filter(o -> o % 2!=0).collect(Collectors.toList());
        System.out.println(lis);
        System.out.println(oddOrMin);

        /**3. print all even numbers from stream **/
        List<Integer>sample=Arrays.asList(2,2,4,8,1,3,13,5,6,9,10,13,17,19,100,101,4);
        List<Integer>even=sample.stream().filter(o -> o % 2 ==0).collect(Collectors.toList());
        System.out.println(even);

        /**4.program to print even numbers from an array**/
        Arrays.stream(arr).filter(x -> x%2==0).forEach(System.out::print);

        /** Print even numbers from set **/
        Set<Integer> numbers = Set.of(1, 4, 8, 40, 11, 22, 33, 99);
        Set<Integer>eveNumbers=numbers.stream().filter(x -> x % 2==0).collect(Collectors.toSet());
        System.out.println(numbers);
    }
}
