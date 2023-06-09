package Prep2023;

import java.util.ArrayList;
import java.util.Stack;

public class GenericTreeSize {


    private static class Node{
        int data;
        ArrayList<Node> children =new ArrayList<>();
    }

    public static void display(Node node){

        String str =node.data + " -> ";
        for(Node child : node.children){
            str += child.data + " ,";
        }
            str += ".";
        System.out.println(str);

        for(Node child : node.children){
            display(child);
        }

    }
public static int size1(Node node){

        int s =0;

        for(Node child : node.children){
            int cs = size1(child);
            s+=cs;
        }
        s=s+1;

        return s;
}


public static int maxNode(Node node){

        int max = Integer.MIN_VALUE;

        for( Node child : node.children){
             int cm = maxNode(child);
             max = Math.max(cm,max);
        }

        max = Math.max(node.data,max);

        return max;
}

public static int height(Node node){
        int ht =0;   // change this to handle base case  in terms of edges ht = -1
        for(Node child : node.children){
            int ch =height(child);
            ht  = Math.max(ht,ch);
        }
        ht +=1;
        return ht;
}


public static void traversals(Node node){


        System.out.println("Node Pre " + node.data); // while going in recursion
        for(Node child : node.children){
            // eddge pre
            System.out.println("Edge Pre "+node.data + " " + child.data);
            traversals(child);
            System.out.println("Edge Post "+node.data + " " + child.data);
        }
    System.out.println("Node Post " + node.data);

}

public static void levelOrder(Node node){
      // queue ds
    // algo
    // remove print add children
}

    public static void main(String[] args){
        int[] arr ={10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,
        -1,-1,90,-1,-1,40,100,-1,-1,-1};

        Node root=null;

        Stack<Node> st = new Stack();
        for(int i=0 ;i < arr.length; i++){
            if(arr[i] == -1){
                st.pop();
            }else{
                Node t =new Node();
                t.data =arr[i];
                if(st.size() > 0) {
                    st.peek().children.add(t);
                }else{
                    root=t;

                }
               st.push(t);
            }

        }
        display(root);

        System.out.println(size1(root));

        System.out.println(maxNode(root));

        System.out.println(height(root));

        traversals(root);
    }

}
