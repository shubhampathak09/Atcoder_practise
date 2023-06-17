package Daily;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class EmployeesReporting {


    static void findCount(HashMap<String,String>map){

        HashMap<String, HashSet<String>> tree = new HashMap<String, HashSet<String>>();




        String ceo = "";

        for(String emp : tree.keySet()){
            String man = map.get(emp);

            if(man.equals(emp)){

                // root
                ceo = man;

            }else{
                if(tree.containsKey(man)){

                   HashSet<String>emps= tree.get(man);
                   emps.add(emp);
                }else
                {
                 HashSet<String>emps = new HashSet<>();
                 emps.add(emp);
                 tree.put(man,emps);
                }
            }


        }

        HashMap<String,Integer>result = new HashMap<>();

        getSize(tree,ceo,result);

        for( String s : result.keySet()){
            System.out.println(s + " " +  result.get(s));
        }

    }

    private static int getSize(HashMap<String, HashSet<String>> tree, String man,HashMap<String,Integer>result) {

        if(tree.containsKey(man)==false){
            return 1;
        }

        int sz =0;

        for(String child : tree.get(man)){
            int cs = getSize(tree, child,result);
            sz+=cs;
        }
        result.put(man,sz);
        return 1+sz;
    }

    public static void main(String[] args){



        HashMap<String,String> map = new HashMap<String,String>();


       Scanner s = new Scanner(System.in);

       int n= s.nextInt();
       for(int i =0 ;i<n;i++){
            map.put(s.next(),s.next());
        }

       findCount(map);

    }

}
