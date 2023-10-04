package Daily;

import java.util.Stack;

public class PreOrderTraversalIterative {


    static class Node
    {
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data =data;
            this.left =null;
            this.right =null;

        }
    }



    static void iterativePreorder(Node root){

        if(root == null)
            return;


        Stack<Node> nodeStack = new Stack<>();

        nodeStack.push(root);


        while(!nodeStack.empty()){
            Node myNode = nodeStack.pop();
            System.out.println(myNode.data);

            if(myNode.right!=null)
                nodeStack.push(myNode.right);

            if(myNode.left!=null){
                nodeStack.push(myNode.left);
            }

        }


    }

    public static  void main(String[] args){
        /**test
         *
         */
    }
}
