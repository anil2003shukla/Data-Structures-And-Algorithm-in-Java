import java.util.*;
public class UnfoldLinkedList {
     static class Node{
        int val;
        Node next=null;
        public Node(int val){
            this.val=val;

        }

    }
     public static void print(Node head){
        while(head !=null){
            System.out.print(head.val+"->");
            head=head.next;
        }
    }
    public static void  UnfoldList(Node head){
        if(head==null||head.next==null){
            return ;
        } 
        Node fh=head;//first head
        Node sh=head.next;//second head
        Node fp=fh; //first previous
        Node sp=sh;//second previous
       while(sp !=null &&sp.next!=null){
        Node f=sp.next;//backup
     //link
     fp.next=f;
     sp.next=f.next;
    //move
    fp=fp.next;
    sp=sp.next;
       }
       fp.next=null;
       sh=reverse(sh);
       fp.next=sh;
    }
    public static Node reverse(Node head){
  if(head==null||head.next==null){
    return head;
  }
  Node prev=null;
  Node curr=head;
  Node forw=null;
  while(curr!=null){
    forw=curr.next;
    curr.next=prev;
    prev=curr;
    curr=forw;
  }
  return prev;
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
      UnfoldList(nods);
       print(nods);
    }
}
