package Daily;

public class MergeSortLinkedList
{
     static class node{
         int val;
         node next;

         public node(int val){
             this.val=val;
         }
     }

     node sortedMerge(node a,node b){
         node result =null;
         if(a==null)
             return b;
         if(b==null)
             return a;
         if(a.val<=b.val){
             result=a;
             result.next=sortedMerge(a.next,b);
         }else
         {
             result=b;
             result.next=sortedMerge(a,b.next);
         }
         return result;
     }

     node mergeSort(node a){
         if(a == null || a.next == null)
             return a;

         node middle = getMiddle(a);
         node nextOfMiddle=middle.next;
         middle.next=null;
         node left=mergeSort(middle);
         node right=mergeSort(nextOfMiddle);
         return sortedMerge(left,right);
     }
     public static node getMiddle(node head){
         if(head==null)
             return head;
         node slow=head;
         node fast=head;
         while(fast.next!=null && fast.next.next!=null){
             slow=slow.next;
             fast=fast.next.next;
         }
         return slow;
     }

    public static void main(String[] args){


        // impl here

    }
}
