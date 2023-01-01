package Algorithms;

public class RevertTree {

    public static class node{
        int data;
        node left;
        node right;
        node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public  static void mirror(node root){
        if(root==null)
            return;

        mirror(root.left);
        mirror(root.right);
        node temp=root.left;
        root.left=root.right;
        root.right=temp;
        return;

    }
    public static void inorder(node root){
        if(root==null)
            return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static node revert(node root){
        mirror(root);
        return root;
    }
    public static void main(String[] args){

  //      System.out.println(Math.negateExact(6)); cool
         node root=new node(1);
        root.left=new node(2);
        root.right=new node(3);
        System.out.println("Printing the tree structure before reversal");
        inorder(root);
        System.out.println("\n");
        System.out.println("printing the tree structure after reversal");
        root=revert(root);
        inorder(root);
    }
}
