package Microsoft;

import java.util.HashSet;

public class RemoveDuplicatesFromUnsortedLinkedList {

    public static class Node{

        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args){

        Node start = new Node(10);
        start.next = new Node(12);
        start.next.next = new Node(11);
        start.next.next.next = new Node(11);
        start.next.next.next.next = new Node(12);
        start.next.next.next.next.next = new Node(11);
        start.next.next.next.next.next.next = new Node(10);


        printList(start);

        System.out.println();

        removeDuplicates(start);

        printList(start);


    }

    public static void removeDuplicates(Node head){
        HashSet<Integer>hs =new HashSet<>();

        Node curr =head;
        Node prev =null;

        while(curr != null){


            if(hs.contains(curr.data)){

                prev.next = curr.next;

            }else{

                hs.add(curr.data);
                prev = curr;

            }

            curr =curr.next;
        }

    }

    public static void printList(Node head){
        while(head != null)
        {
            System.out.print(head.data +" ");
            head= head.next;
        }
    }

}
