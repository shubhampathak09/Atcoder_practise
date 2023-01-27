package Algorithms;

public class MaxPathSumBinaryTree {
    public static class node{
        int data;
        node left;
        node right;
        public node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static int maxval;

    public static int findMaxUtil(node node,int mxval)
    {
        if(node==null)
            return 0;

        int l=findMaxUtil(node.left,mxval);
        int r=findMaxUtil(node.right,mxval);
        int max_single=Math.max(Math.max(l,r)+node.data,node.data);
        int max_top=Math.max(max_single,l+r+node.data);
        mxval=Math.max(mxval,max_top);
        maxval=mxval;
        return max_single;
    }

public static void inorder(node root){
        if(root==null)
            return;
        inorder(root.left);
    System.out.print(root.data+" ");
    inorder(root.right);
}

public static void main(String[] args){

node root=new node(10);
root.left=new node(2);
root.right=new node(10);
root.left.left=new node(20);
root.left.right=new node(1);
root.right.right=new node(-25);
root.right.right.left=new node(3);
root.right.right.right=new node(4);

    System.out.println("Printing the Structure of tree for debugging purpose only");
    inorder(root);
    maxval=Integer.MIN_VALUE;
    int sum=findMaxUtil(root,maxval);

  //  System.out.println(sum);
    System.out.println("Max Val is.."+maxval);

}
}
