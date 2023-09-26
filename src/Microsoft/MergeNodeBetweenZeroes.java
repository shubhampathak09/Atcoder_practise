package Microsoft;

import scala.Int;

import java.util.ArrayList;

public class MergeNodeBetweenZeroes {

    public static class Node{

        int data;
        Node next;
        Node(int data){
            this.data =data;
            this.next =null;
        }
    }

    public static void main(String[] args){

        Node head= new Node(0);
        head.next = new Node(3);
        head.next.next = new Node(1);
        head.next.next.next = new Node(0);
        head.next.next.next.next =new Node(4);
        head.next.next.next.next.next = new Node(5);
        head.next.next.next.next.next.next = new Node(2);
        head.next.next.next.next.next.next.next = new Node(0);


        ArrayList<Integer>arr = new ArrayList<>();


        int sum =0;


        Node temp =head.next;
        Node temp1 = new Node(-1);
        while(temp!=null){

            while(temp.data!=0 && temp!=null){
                sum+=temp.data;
                temp=temp.next;
            }
            if(temp1.data ==-1){
                temp1=new Node(sum);
            }else{
                temp1.next = new Node(sum);
            }
            arr.add(sum);
            sum=0;

            if(temp!=null)
                temp=temp.next;



        }
        head=temp1;


        for(int x :arr){
            System.out.println(x);
        }


    }

}
