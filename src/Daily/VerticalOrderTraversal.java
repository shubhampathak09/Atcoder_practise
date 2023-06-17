package Daily;

import scala.Int;

import java.util.*;

public class VerticalOrderTraversal {

    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data =data;
            this.left = null;
            this.right = null;
        }
    }


    static ArrayList<Integer> verticalOrder(Node root){

        Queue<Pair> q = new ArrayDeque<>();
        Map<Integer,ArrayList<Integer>> map = new TreeMap<>();
        q.add(new Pair(0,root));

              while(!q.isEmpty()){
                  Pair cur = q.poll();
                  if(map.containsKey(cur.hd)){
                      map.get(cur.hd).add(cur.node.data);
                  }else{
                      ArrayList<Integer>temp = new ArrayList<>();
                      temp.add(cur.node.data);
                      map.put(cur.hd, temp);
                  }

                  if(cur.node.left!= null){
                      q.add(new Pair(cur.hd-1, cur.node.left));
                  }

                  if(cur.node.right!=null){
                      q.add(new Pair(cur.hd+1, cur.node.right));
                  }
              }

              ArrayList<Integer> ans = new ArrayList<>();
              for(Map.Entry<Integer,ArrayList<Integer>> entry : map.entrySet()){
                  ans.addAll(entry.getValue());
        }

              return ans;
    }

    public static class Pair{

        int hd;
        Node node;

        public Pair(int hd,Node node){
            this.node = node;
            this.hd= hd;
        }

    }


}
