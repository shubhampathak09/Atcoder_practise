package Daily;

public class BurnBinaryTree {

    public static class Node {

        int data;
        Node left;
        Node right;
        Node(int data){
            this.left=null;
            this.right =null;
            this.data=data;
        }
    }

    public static class Depth {

       int d;
       public Depth(int d){
           this.d=d;
       }
    }

    static int ans=-1;

    int burnTree(Node root,Depth depth,int target)
    {
        if(root == null){

            return 0;
        }

        if(root.data == target){
            depth.d = 1;
            return 1;
        }
        Depth ld  = new Depth(-1);
        Depth rd = new Depth((-1));

        int lh = burnTree(root.left,ld,target);
        int  rh = burnTree(root.right,rd,target);

        if(ld.d != -1){
            ans = Math.max(ans,ld.d + 1 + rh);
            depth.d = ld.d +1;
    }else if(rd.d != -1)
        {
            ans = Math.max(ans, lh +1 + rd.d);
            depth.d=rd.d +1;
        }
        return Math.max(lh,rh)+1;
    }

    public  static void main(String[] args){

    }

}
