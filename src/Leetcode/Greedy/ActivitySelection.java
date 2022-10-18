package Leetcode.Greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ActivitySelection {

    public static class Pair implements Comparable<Pair> {
        int start;
        int finish;

        Pair(int i,int j){
            this.start=i;
            this.finish=j;
        }
        @Override
        public int compareTo(Pair o1) {
            return this.finish - o1.finish;
        }
    }

    public static void main(String[] args){
        int s[]={1,3,0,5,8,5};
        int f[]={2,4,6,7,9,9};
        ArrayList<Pair>p=new ArrayList<>();
        for(int i=0;i<s.length;i++){
          p.add(new Pair(s[i],f[i]));
        }
        Collections.sort(p);

        
    }

}
