package Daily;

import java.util.HashMap;

public class MajorityElement {

    public static class Node{
        int data;
        Node left;
        Node right;
        int ct=1;
    }

    public static void findMajorityElement(int[] a){


        HashMap<Integer,Integer>hm =new HashMap<>();

        for(int i=0;i<a.length;i++){

            if(hm.containsKey(a[i]))

            {
    //            System.out.print("whats wrong");
                int count=hm.get(a[i])+1;
                if(count> a.length/2)
                {
                   // System.out.print();
                    System.out.println("Printing the Maj Element. "+ a[i]);
                    return;
                }else
                    hm.put(a[i],count);
            }
            else
                hm.put(a[i],1);
        }
    }

    public static void main(String[] args){

        int a[] = new int[]{2,2,2,2,5,5,2,3,3};
 //       System.out.print(1);
        findMajorityElement(a);
    }

}
