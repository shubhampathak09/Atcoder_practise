package Scala;

import java.util.ArrayList;
import java.util.List;

public class ListFiltering {

    public static void main(String[] args){

        List<String> res=new ArrayList<>();
        res.add("cat");
        res.add("1");
        res.add("dog");
        res.add("pig");
        res.add("21");


        List<Integer> out=new ArrayList<>();

        for(String s : res){
            try {
                out.add(Integer.parseInt(s));
            }
            catch (NumberFormatException e){
                //continue;
            }
        }
        System.out.println(out);

    }
}
