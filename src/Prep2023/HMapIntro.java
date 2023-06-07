package Prep2023;

import java.util.HashMap;
import java.util.Set;

public class HMapIntro {

    public static void main(String [] args){

        //hm.put(key)

        //hm.get()

        // hm.cotainsKey()

        HashMap<String,Integer> hm =new HashMap<>();

        hm.put("India",35);
        hm.put("Australia",10);
        hm.put("China",200);
        hm.put("Pak",20);
        hm.put("US",2);
        hm.put("UK",10);

        System.out.println(hm);


       //order is not under contol in map

        System.out.println(hm.containsKey("India"));

        Set<String> keys= hm.keySet();

        for(String key : hm.keySet()){
            Integer val= hm.get(key);
            System.out.println(key +" " + val);
        }


        // put,get,ck,keySet   -> o(1)
    }
}
