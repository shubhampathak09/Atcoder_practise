package Grid169;

import java.util.ArrayList;
import java.util.List;

public class LowestCommonAncestor {

static class Node
{
    int data;
    Node left,right;
    Node(int value){
        data = value;
        left = right =null;

    }
    public static void main(String[] args){
        Node root =new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right =new Node(5);
        root.right.left = new Node(6);
        root.right.right =new Node(7);

        System.out.println(findLCA(4,5));


        System.out.println(findLCA(4,6));


        System.out.println(findLCA(3,4));

        System.out.println(findLCA(2,4));


    }



    static Node root;

    static int findLCA(int n1,int n2){
        List<Integer>path1 = new ArrayList<>();
        List<Integer>path2 =new ArrayList<>();
        path1.clear();
        path2.clear();
        return findLCAInternal(root,n1,n2);
    }


    static int findLCAInternal(Node root, int n1,int n2){

        List<Integer>path1 = new ArrayList<>();
        List<Integer>path2 =new ArrayList<>();

        if(!findPath(root,n1,path1) || !findPath(root,n2,path2)){
            return -1;
        }

        int i;
        for(i=0;i<path1.size() && i<path2.size();i++){
            if(!path1.get(i).equals(path2.get(i))){
                break;
            }
        }
        return path1.get(i-1);
    }
    static boolean findPath(Node root, int n,List<Integer>path){
        if(root == null)
            return false;
        path.add(root.data);


        if(root.data == n || findPath(root.left,n,path) || findPath(root.right,n,path)){
            return true;
        }

        path.remove(path.size()-1);
        return false;
    }

}

public class Solution{




}

}
