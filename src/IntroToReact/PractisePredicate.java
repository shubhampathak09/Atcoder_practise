package IntroToReact;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PractisePredicate {

    // list of string , remove empty strings -ok


    public static void main(String[] args){

        List<String> list=new ArrayList<>();
        list.add("Basics");
        list.add("");
        list.add("Strong");
        list.add("");
        list.add("Shubham");
        list.add("Pathak");
        list.add("");

        Predicate<String>predicate= s -> !s.isEmpty();
        Predicate<String>pfilter = s -> s.contains("Basics");

        List<String> newList=filterList(list,predicate);
        List<String>filterList=filterList(list,pfilter);
        /** contains only the nonempty string **/

        System.out.println(newList);
        System.out.println(filterList);
        /** retyun onlu string that citais basics **/

    }

    private static List<String> filterList(List<String> list, Predicate<String> predicate) {

    List<String> newList =new ArrayList<>();
    for(String string : list){
        if(predicate.test(string)){
            newList.add(string);
        }
    }
    return newList;
    }


}
