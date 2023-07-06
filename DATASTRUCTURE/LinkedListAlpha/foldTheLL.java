import java.util.*;
public class foldTheLL {
    

    static class Node{
        int val;
        Node next=null;
        public Node(int val){
            this.val=val;

        }

    }
    public static Node midNode(Node head){
        if(head==null||head.next==null){
            return head;
        }
        Node slow=head;
        Node fast=head;
        while(fast.next !=null&&fast.next.next !=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static Node reverse(Node head){
        if(head==null||head.next==null){
            return head;
        }
        Node prev=null;
        Node curr=head;
        Node forw=null;
        while(curr !=null){
             forw=curr.next;//backup;
            curr.next=prev;//link
            prev=curr;
            curr=forw;
        }
        return prev;
    }
    public static void foldList(Node head){
        if(head==null||head.next==null){
            return;
        }
        Node mid=midNode(head);
        Node  Nhead=mid.next;
        mid.next=null;
       Nhead=reverse(Nhead);
       Node c1=head;
       Node c2=Nhead;
       Node f1=null;
       Node f2=null;
while(c1 !=null && c2 !=null){
       //backup
       f1=c1.next;
       f2=c2.next;
//limk line 
c1.next=c2;
c2.next=f1;
//move 
c1=f1;
c2=f2;

}
    }
    public static void print(Node head){
        while(head !=null){
            System.out.print(head.val+"->");
            head=head.next;
        }
    }
     public static void main(String[] args) {
       Scanner scn=new Scanner(System.in); 
       int n=scn.nextInt();
       Node dummy=new Node(-1);
       Node prev=dummy;
       while(n-- >0){
        prev.next=new Node(scn.nextInt());
        prev=prev.next;
       }
      Node nods=dummy.next;
      foldList(nods);
       print(nods);
    }
}
