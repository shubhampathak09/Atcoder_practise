package Prep2023;

import scala.Int;

import java.util.*;

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
    Queue<Node> q = new ArrayDeque<>();
    q.add(node);
    while(q.size() > 0){
        Node temp = q.remove();
        System.out.println(temp.data);
        for(Node child : temp.children){
            q.add(child);
        }
    }
    System.out.println(".");
    }

public static void Zigzag(Node node){
Stack<Node> ms = new Stack();
ms.push(node);
Stack<Node> cs = new Stack<>();

int level=1;

while(ms.size() > 0){
    node = ms.pop();
    System.out.println(node.data + " ");
    if(level % 2 == 1){
        for(int i =1 ;i< node.children.size();i++){
            Node child = node.children.get(i);
            cs.push(child);
        }
    }else{
        for(int i = node.children.size() -1 ; i>=0 ;i--){
            Node child =node.children.get(i);
            cs.push(child);
        }
    }
    if(ms.size() == 0){
        ms=cs;
        cs = new Stack<>();
        level++;
        System.out.println();
    }
/** greedy , trees , dp, recursion, arrays ** /
 *
 */




}


}


public static void mirror(Node node){

    for(Node child : node.children){
        mirror(child);
    }

    Collections.reverse(node.children);

}



 public static void levelOrderLineWise(Node node){

        Queue<Node> q =new ArrayDeque<>();
        Queue<Node> cq = new ArrayDeque<>();
        q.add(node);
        while(q.size() > 0){
           node = q.remove();
            System.out.print(node.data+" ");

            for(Node child : node.children){
                cq.add(child);
            }
            if(q.size() == 0){
                q=cq;
                cq=new ArrayDeque<>();
                System.out.println();
            }
        }


 }

 public static void removeLeaves(Node node){


     for(int i =node.children.size()-1 ;i>=0 ;i--){
         Node child = node.children.get(i);
         if(child.children.size() == 0){
             node.children.remove(child);
         }
     }


        for(Node child : node.children){
            removeLeaves(child);
        }


 }

 public  static Node getTail(Node node){

        while(node.children.size() ==1){
            node  = node.children.get(0);
        }
        return node;
 }

   public static void linearize(Node node){

        for(Node child : node.children){
            linearize(child);
        }
       while(node.children.size() > 1){
           Node last = node.children.remove(node.children.size()-1);
           Node slast = node.children.get(node.children.size()-1);
           Node slt =getTail(slast);
           slt.children.add(last);
       }

   }

   public static ArrayList<Integer> nodeToRootPath(Node node,int data){

       if (node.data == data) {

           ArrayList<Integer>list = new ArrayList<>();
           list.add(node.data);
           return list;
       }

       for(Node child : node.children){
           ArrayList<Integer>ptc = nodeToRootPath(child,data);
           if(ptc.size() > 0){
               ptc.add(node.data);
           }
       }

       return new ArrayList<>();
   }

   public static boolean find(Node node,int data){

        if(node.data ==data){
            return true;
        }
        for( Node child : node.children){
            boolean fic = find(child,data);
            if(fic){
                return true;
            }
        }
        return false;
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
      //  display(root);

    //    System.out.println(size1(root));

      //  System.out.println(maxNode(root));

        //System.out.println(height(root));

        //traversals(root);

      //  levelOrder(root);

     //   levelOrderLineWise(root);

        Zigzag(root);

       // mirror(root);

       // display(root);

        removeLeaves(root);

        linearize(root);

        nodeToRootPath(root,110);
    }

}
