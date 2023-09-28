package BinaryTrees;

import scala.reflect.internal.Trees;

import java.util.*;

public class BinaryTreeLevelOrderTraversal2 {

    static class TreeNode{
     int data;
     TreeNode left;
     TreeNode right;

     TreeNode(int data){
         this.data =data;
         this.left =null;
         this.right =null;
     }
    }

    public List<List<Integer>> levelOrderBottom(TreeNode root) {



     List<List<Integer>>finalList = new LinkedList<>();

        Queue<TreeNode>queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){


            int sz = queue.size();
            List<Integer>subList = new LinkedList<>();
            Stack<Integer>st = new Stack<>();
            for(int i=0 ;i<sz;i++){
                if(queue.peek().left != null)
                    queue.offer(queue.peek().left);
                if(queue.peek().right != null)
                    queue.offer(queue.peek().right);

                st.add(queue.peek().data);
            }
            while(!st.isEmpty()){
                subList.add(st.pop());
            }
            finalList.add(subList);

        }


        Collections.sort(finalList,Collections.reverseOrder());

        return finalList;
    }

    public static void main(String[] args){

    }

}
