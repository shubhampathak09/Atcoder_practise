package Daily;

public class NthNodeFromEnd {


    Node head;

    class Node{
        int data;
        Node next;
        Node(int d){
            data=d;
            next=null;
        }
    }

    void printNthFromLast(int N){
        Node main_ptr=head;
        Node ref_ptr=head;

        int count =0;


        if(head!=null){
            while(count<N){
                if(ref_ptr == null){
                    System.out.println(N + "greater than number of nodes in LL");
                    return;
                }
                ref_ptr=ref_ptr.next;
                count++;
            }
        }

    }
}
