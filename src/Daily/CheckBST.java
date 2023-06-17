package Daily;

public class CheckBST {

    static class Node{
        int data;
                Node left;
        Node right;
        Node(int data){
            this.data =data;
            this.left = left;
            this.right =right;
        }
    }

     boolean isBST(Node root,int min,int max){


        if(root == null)
            return true;


        if(root.data < min || root.data > max)
            return  false;

        return isBST(root.left,min, root.data-1)
                && isBST(root.right,root.data +1,max);


     }

    public static void main(String[] args){

    }

}
