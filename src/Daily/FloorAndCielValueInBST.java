package Daily;

public class FloorAndCielValueInBST {

    // flloor les but bigger than other

    // ciel  big but least


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

    int floor(Node root,int key){
        int ans = Integer.MAX_VALUE;

        while(root != null){
         if(root.data == key){
             return root.data;
         }
         if(root.data > key){
             root = root.left;
         }else{
             ans =root.data;
             root = root.left;
         }

        }
        return ans;
    }

    int ciel(Node root,int key){
        int ans = Integer.MIN_VALUE;
        while(root !=null){
            if(root.data == key){
                return root.data;
            }
            if(root.data < key){
                root = root.right;
            }else{
                ans =root.data;
                root = root.left;
            }
        }
        return ans;
    }


}
