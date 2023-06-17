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


    BurnBinaryTree.Node insert(BurnBinaryTree.Node root,int key){
        if(root == null){
            return new BurnBinaryTree.Node(key);
        }
        if(root.data > key){
            root.left =insert(root.left,key);
        }else if( root.data < key){
            root.right = insert(root.right,key);
        }
        return root;
    }





    public static void main(String[] args){
        // test here
    }

}
