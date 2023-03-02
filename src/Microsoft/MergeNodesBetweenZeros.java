package Microsoft;

public class MergeNodesBetweenZeros {

    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int val) {this.val=val;
        this.next=null;
        }

    }
    static void printList(ListNode head){
        while(head.next!=null){
            System.out.print(head.val + "->");
            head=head.next;
        }
        System.out.println(head.val);
    }
    static void inPlaceStore(ListNode head){
        if(head.val==0){
            head=head.next;
        }
        ListNode res=head;
        int sum=0;
        ListNode temp=head;
        while(temp!=null){
            if(temp.val!=0){
                sum+=temp.val;
                temp=temp.next;
            }else{
                res.val=sum;
                res.next=temp.next;
                temp=res.next;
                res=res.next;
                sum=0;
            }
        }
        printList(head);
    }
    public static ListNode mergeNodes(ListNode head) {

        return null;
    }
    public static void main(String[] args){
     ListNode head= new ListNode(3);
     head.next= new ListNode(2);
     head.next.next=new ListNode(0);
     head.next.next.next=new ListNode(4);
     head.next.next.next.next=new ListNode(5);
     head.next.next.next.next.next=new ListNode(0);
     head.next.next.next.next.next.next=new ListNode(6);
     head.next.next.next.next.next.next.next=new ListNode(7);
     inPlaceStore(head);
    }

}
