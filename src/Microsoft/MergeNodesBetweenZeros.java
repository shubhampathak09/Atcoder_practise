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
            }
        }
        printList(head);
    }
    public static ListNode mergeNodes(ListNode head) {

        return null;
    }
    public static void main(String[] args){

    }

}
