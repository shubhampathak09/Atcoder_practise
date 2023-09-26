package Grid169;

public class HeightBalanced {

    static class Node{

    int data;
    Node left;
    Node right;
    Node(int data){
        this.data =data;
        this.left =null;
        this.right =null;
    }
    }

    static boolean isBalanced(Node node){

        if(node ==null)
            return true;

        int lh;
        int rh;

        lh = height(node.left);
        rh =height(node.right);

        if(Math.abs(lh -rh) <=1 && isBalanced(node.left) && isBalanced(node.right))
            return true;

        return false;

    }

    static int height(Node node){

        if(node == null)
            return 0;

        return 1 +  Math.max(height(node.left),height(node.right));

    }

    public static void main(String[] args){
        Node root =new Node(1);
        root.left =new Node(2);
        root.right =new Node(3);
        root.right.right =new Node(4);
        root.right.right.left =new Node(5);
        System.out.println(isBalanced(root));
    }
}
