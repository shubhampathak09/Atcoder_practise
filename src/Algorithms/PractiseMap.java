package Algorithms;


import java.util.LinkedList;

public class PractiseMap {


    public static class HashMap<K,V>{

        private class HMNode {
            K key;
            V value;


            HMNode(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int size;

        private LinkedList<HMNode>[] buckets;

        public HashMap(){
            initbuckets(4);
            size=0;
        }

        private void initbuckets(int N){
            buckets = new LinkedList[N];
            for(int i=0;i<N;i++){
                buckets[i] = new LinkedList<>();
            }
        }





    }



}
