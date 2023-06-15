package Daily;

import java.util.ArrayDeque;
import java.util.Queue;

public class MaxLevelSumBinaryTree {


    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data =data;
            this.left =null;
            this.right = null;
        }
    }

    static int maxLevelSum(Node root){

        int result =root.data;

        Queue<Node> q =new ArrayDeque<>();

        q.add(root);


        while(!q.isEmpty()){


            int count =q.size();

            int sum =0;
            while(count >0){

                Node temp=q.poll();
                sum += temp.data;

                if(temp.left !=null)
                    q.add(temp.left);

                if(temp.right!=null)
                    q.add(temp.right);

                count =count -1;
            }

            result =Math.max(sum,result);
        }
        return result;
    }

    public static void main(String[]args){

        Node root = new Node(1);

        root.left =new Node(2);

        root.right =new Node(3);

        root.left.left =new Node(4);

        root.left.right =new Node(5);

        root.right.right = new Node(8);

        root.right.right.left =new Node(6);

        root.right.right.right = new Node(7);


        System.out.println(maxLevelSum(root));

    }

}
