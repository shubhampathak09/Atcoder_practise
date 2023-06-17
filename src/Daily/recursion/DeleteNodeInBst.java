package Daily.recursion;

public class DeleteNodeInBst {


    static class Node{
        int data;;
        Node left;
        Node right;
        Node(int data){
            this.left = null;
            this.right =null;
        }



       static int minValue(Node root){
            int minV= root.data;
            while(root.left!=null){
                minV=root.data;
                root=root.left;
            }
            return minV;
        }
        public static Node deleteNode(Node root,int key){

            if(root == null)
                return root;

            if(key< root.data)
                root.left = deleteNode(root.left,key);
                else if(key > root.data)
                    root.right =deleteNode(root.right,key);
            else
            {
                if(root.left == null)
                    return root.right;
                else if(root.right == null)
                    return root.left;

                root.data = minValue(root.right);

                root.right = deleteNode(root.right,root.data);
            }
            return root;
        }

    }



}
