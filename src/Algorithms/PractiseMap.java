package Algorithms;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.concurrent.ExecutorService;

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

       private void put(K key,V value){
            int bi = hashfn(key);
            int di = getIndexWithinBucket(key,bi);
            if(di !=-1){
                HMNode node = buckets[bi].get(di);
                node.value=value;
           }else{
                HMNode node = new HMNode(key,value);
                buckets[bi].add(node);
                size++;
            }

            double lambda = size*1.0/buckets.length;
            if(lambda > 2.0){
                 rehash();
            }
       }

       public boolean containsKey(K key){
            int bi = hashfn(key);
            int di = getIndexWithinBucket(key,bi);
            if(di !=-1)
                return true;
            else
                return false;
       }

       public V get(K key){
            int bi = hashfn(key);
            int di = getIndexWithinBucket(key,bi);
            if(di !=-1){
                HMNode node = buckets[bi].get(di);
                return node.value;

            }
            return null;
        }

        private void rehash(){
           LinkedList<HMNode>[] oba=buckets;
           initbuckets(oba.length * 2);
           size =0;
           for(int i=0;i<oba.length;i++){
               for(HMNode node : oba[i] ){
                   put(node.key,node.value);
                   //size++;
               }
           }
        }

        public ArrayList<K> keySet() throws Exception{
            ArrayList<K>keys = new ArrayList<>();
            for(int i=0;i<buckets.length;i++){
                for(HMNode node : buckets[i]){
                    keys.add(node.key);
                }
            }
            return keys;
        }

       public V remove(K key){
            int bi = hashfn(key);
            int di = getIndexWithinBucket(key,bi);
            if(di !=-1){
                HMNode node = buckets[bi].remove();
                size--;
                return node.value;
            }
            return null;

       }


       public int size(){
            return size;
       }


       private int hashfn(K key){
            int hc = key.hashCode();
            int abshc = Math.abs(hc) % buckets.length;
            return abshc;
            // use of hashCode > available on every Integer
       }

       private int getIndexWithinBucket(K key,int bi){
            int di=0;
            for(HMNode node : buckets[bi]){
                if(node.key.equals(key)){
                    return di;
                }
                di++;
            }
            return -1;
       }

    }



}
