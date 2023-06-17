package Daily;

public class BSTTree {

    boolean search(BurnBinaryTree.Node root, int x){

        if(root == null)
            return false;

        if(root.data == x){
            return true;
        }

        if(root.data > x){
            return search(root.left,x);
        }
            return search(root.right,x);
    }


    public static void main(String[] args){
        // test here
    }

}
