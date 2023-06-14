package Daily;

public class MaxDifferenceNode {

    static class Node{
        int key;
        Node left,right;
        public Node(int data){
            this.key =data;
            left=right=null;
        }
    }

    static class Res {
        int r =Integer.MAX_VALUE;
    }


    int maxDiffNode(Node t, Res res){

        if(t == null){
            return Integer.MAX_VALUE;
        }

        if(t.left == null && t.right == null){
            return t.key;
        }

        int left = maxDiffNode(t.left,res);
        int right = maxDiffNode(t.right,res);
        int val = Math.min(left,right);
        res.r = Math.max(res.r, t.key - val);
        return Math.min(val,t.key);
    }

    int maxDiff(Node root){
        Res res = new Res();
     maxDiffNode(root,res);

        System.out.println(res.r);

        return res.r;
    }

    public static void main(String[] args){



    }

}
