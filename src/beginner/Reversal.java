package beginner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Reversal {
    /**
     * Problem statement
     *You have an array of N integers, but you don't like this array much and you would like to have it reversed.
     *
     */

    public static void main(String[] args){
        Scanner s=new Scanner(System.in);

        int n=s.nextInt();
        ArrayList<Integer> arr=new ArrayList<>();

        while(n>0){
        int ele=s.nextInt();
        arr.add(ele);
        n--;
        }
        System.out.println("Before reverseal.."+arr);

        Collections.reverse(arr);

        System.out.println("After reversal.."+ arr);
    }
}
