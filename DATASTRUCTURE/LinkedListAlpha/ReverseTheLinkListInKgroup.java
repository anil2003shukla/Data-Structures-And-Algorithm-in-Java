import java.util.*;
public class ReverseTheLinkListInKgroup {
    public static Scanner scn=new Scanner(System.in);
 static class Node{
    int val;
    Node next;
    public Node(int val){
        this.val=val;

    }
 }
 static Node th=null;
 static Node tt=null;

 public static void addfirstlist(Node node){
    if(th==null){
   th=node;
   tt=node;


    }
    else{
        node.next=th;
        th=node;
    }
 }
 public static int length(Node node){
    int len=0;
    Node curr=node;
    while(curr !=null)
{
curr=curr.next;
len++;
} 
return len;
}
 public static Node reverseInKGroup(Node head ,int k){
    if(head==null||head.next==null||k==0){
        return head;
    }
    Node oh=null,ot=null;
    int len=length(head);
    Node curr=head;
    while(len>=k){
         int tempk=k;
         while(tempk-- >0){
            Node forw=curr.next;
            curr.next=null;
            addfirstlist(curr);
            curr=forw;
         }
         if(oh ==null){
            oh=th;
            ot=tt;
         }
         else{
          ot.next=th;
          ot=tt;
         }
         th=null;
         tt=null;
         len -=k;
    }
    ot.next=curr;
   return oh;
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
    while(n-- >0){
        prev.next=new Node(scn.nextInt());
        prev=prev.next;
    }
    return dummy.next;
 }
 public static void main(String args[]){
    int n=scn.nextInt();
  Node head=  creatList(n);
 Node heads= reverseInKGroup(head,3);
printlist(heads);
 }
}
