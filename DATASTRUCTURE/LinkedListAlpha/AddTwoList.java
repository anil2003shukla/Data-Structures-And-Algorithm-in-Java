import java.util.*;

public class AddTwoList {
     public static Scanner scn=new Scanner(System.in);
 static class Node{
    int val;
    Node next;
    public Node(int val){
        this.val=val;

    }
 }
 public static Node reverse(Node head){
    if(head==null||head.next==null){
        return head;
    }
    Node prev=null,curr=head;
    while(curr !=null){
        Node forw=curr.next;//backup
        curr.next=prev;//link
        prev=curr;
        curr=forw;
 }
 return prev;
}
public static Node addTwoListNumbers(Node l1,Node l2){
    if(l1==null||l2==null){
        return l1!=null?l1:l2;

    }
    Node c1=reverse(l1);
    Node c2=reverse(l2);
    Node head=new Node(-1);
    Node itr=head;
    int carry=0;
    while(c1 !=null||c2!=null ||carry !=0){
        int sum=carry+(c1!=null ?c1.val:0)+(c2!=null? c2.val:0);
        int ld=sum%10;//last digit of sum 
        carry=sum/10;
        itr.next=new Node(ld);
        itr=itr.next;
          if(c1!=null){
            c1=c1.next;

          }
          if(c2!=null){
            c2=c2.next;
          }
    }
    return reverse(head.next);
}
public static void printlist(Node node){
    while(node !=null){
        System.out.print(node.val+"->");
        node =node.next;
    }
 }
    public static  Node creatList(int n){
    Node dummy=new Node(-1);
    Node prev=dummy;
    
    System.out.println("enter  nodes in first list");
    while(n-- >0){
        prev.next=new Node(scn.nextInt());
        prev=prev.next;
    }
    return dummy.next;
 }
  public static  Node creatList2(int n){
    Node dummy=new Node(-1);
    Node prev=dummy;
    System.out.println("enter  nodes in second  list");
    while(n-- >0){
        prev.next=new Node(scn.nextInt());
        prev=prev.next;
    }
    return dummy.next;
 }
 public static void main(String args[]){
    System.out.println("enter no nodes in first list");
    int n=scn.nextInt();
     
  Node l1=  creatList(n);
  System.out.println("enter no nodes in second list");
  int n2=scn.nextInt();
  Node l2=creatList2(n2);
 Node heads= addTwoListNumbers(l1,l2);
printlist(heads);
 }
}
