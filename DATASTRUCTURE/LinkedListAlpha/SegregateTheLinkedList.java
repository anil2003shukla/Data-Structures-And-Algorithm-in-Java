import java.util.*;
public class SegregateTheLinkedList {
    public static Scanner scn=new Scanner(System.in);
    public static class Node{
         int val=0;
         Node next=null;
         public Node(int val){
        this.val=val;
      }
         
    }
    public static Node segregateEvenOdd(Node head){
        if(head==null||head.next==null){
            return head;
        }
        Node dummyEven=new Node(-1);
        Node dummyOdd=new Node(-1);
        Node eventail=dummyEven,oddtail=dummyOdd,curr=head;
         while(curr !=null){
            if(curr.val% 2 !=0){
                oddtail.next=curr;
                oddtail=oddtail.next;
            }
            else{
                eventail.next=curr;
                eventail=eventail.next;
            }
            curr=curr.next;
         }
         eventail.next=dummyOdd.next;
         oddtail.next=null;
         return dummyEven.next;
    }
    public static void printd(Node head){
         while(head !=null){
            System.out.print(head.val+"->");
            head=head.next;
        }
    }
    public static Node creat(int n){
         Node dummy=new Node(-1);
        Node prev=dummy;
           while(n-- >0){
            prev.next=new Node(scn.nextInt());
            prev=prev.next;
        }
       return dummy.next;
    }
    public static  void main(String args[]){
        int n=scn.nextInt();
       Node head=creat(n);
              Node heads=segregateEvenOdd(head);
       printd(heads);
    }
}
