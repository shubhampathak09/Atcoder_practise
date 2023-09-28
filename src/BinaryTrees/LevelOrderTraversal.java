package BinaryTrees;

import scala.reflect.internal.Trees;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {


    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(){};
        TreeNode(int val){
            this.val =val;
            this.left =null;
            this.right =null;
        }
    }

    public static void main(String[] args){

        Queue<TreeNode> queue =  new LinkedList<>();

        TreeNode root = new TreeNode(1);

        List<List<Integer>> wrapList =  new java.util.LinkedList<>();

        if(root == null)
            return;


        queue.offer(root);

        while(!queue.isEmpty()){
            int levelNUmm = queue.size();
            List<Integer>subList = new LinkedList<Integer>();
            for(int i=0 ;i<levelNUmm;i++){
                if(queue.peek().left != null) queue.offer(queue.peek().left);
                if(queue.peek().right != null) queue.offer(queue.peek().right);
                subList.add(queue.poll().val);
            }
            wrapList.add(subList);
        }

    //print wrapList
    }

}
