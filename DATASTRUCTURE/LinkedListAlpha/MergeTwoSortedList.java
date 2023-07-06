import java.util.*;
public class MergeTwoSortedList {
    public static Scanner scn=new Scanner(System.in);

     static class Node{
        int val=0;
        Node next=null;
        Node(int val){
            this.val=val;

        }
     }
     public static Node merge(Node l1,Node l2){
        if(l1==null||l2==null){
            return l1 !=null ?l1:l2;
        }
        Node dummy=new Node(-1);
          Node prev=dummy;
          Node c1=l1;
          Node c2=l2;
          
          while(c1 !=null && c2 !=null){
            if(c1.val<c2.val){
                prev.next=c1;
                c1=c1.next;
            }
            else{
                prev.next=c2;
                c2=c2.next;
            }
            prev=prev.next;
          }
          prev.next=c1 !=null ?c1:c2;
           return dummy.next;
     }
      public static  Node creatList(int n){
    Node dummy=new Node(-1);
    Node prev=dummy;
    
    System.out.println("enter  nodes in  list");
    while(n-- >0){
        prev.next=new Node(scn.nextInt());
        prev=prev.next;

    }
    return dummy.next;
 }
 public static void printlist(Node node){
    while(node !=null){
        System.out.print(node.val+"->");
        node =node.next;
    }
 }
 public static void main(String args[]){
    System.out.println("enter no nodes in first list");
    int n=scn.nextInt();
     
  Node l1=  creatList(n);
  System.out.println("enter no nodes in second list");
  int n2=scn.nextInt();
  Node l2=creatList(n2);
 Node heads= merge(l1,l2);
printlist(heads);
 }
}
