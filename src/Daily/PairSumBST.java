package Daily;

import java.util.Set;

public class PairSumBST {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data =data;
        }
    }

    public boolean util(Node root, int sum, Set<Integer> set){

        if(root == null)
            return false;

        if(util(root.left,sum,set)){
            return true;
        }

        if(set.contains(sum - root.data)){
            return true;
        }
        set.add(root.data);

        return util(root.right,sum,set);
    }

    public static void main(String[] args){



    }

}
