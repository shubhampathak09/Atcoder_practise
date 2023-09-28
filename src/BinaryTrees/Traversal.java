package BinaryTrees;

public class Traversal {


    static class Node
    {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static void preorder(Node root){

        if(root == null)
            return;

        System.out.print(root.data +  " ");
        preorder(root.left);
        preorder(root.right);
    }

    static void inorder(Node root){

        if(root == null)
            return;
        inorder(root.left);
        System.out.print(root.data +  " ");
        inorder(root.right);
    }


    public static void main(String[] args){

        Node root = new Node(1);
        root.left =new Node(2);
        root.right = new Node(3);


        System.out.println("Preorder..");

        preorder(root);

        System.out.println();

        System.out.println("Inorder traversal...");

        inorder(root);
    }


}
