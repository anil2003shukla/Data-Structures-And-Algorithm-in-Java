import java.util.Scanner;

public class MergeKlistInSingleList {
    public static Scanner scn=new Scanner(System.in);
    public static class Node{
        int val=0;
        Node next=null;
        public Node(int val){
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
     public static Node mergeKlist(Node[] lists,int st,int end){
        if(st>end){
            return null;
        }
        if(st==end){
            return lists[st];
        }
        int mid=(st+end)/2;
        Node l1=mergeKlist(lists,st,mid);
        Node l2=mergeKlist(lists,mid+1,end);
        return merge(l1,l2);
     }
     public static Node mergeKlist(Node[] lists){
        if(lists.length==0){
            return null;
        }
       return  mergeKlist(lists,0,lists.length-1);
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

    public static void main(String[]args){
       System.out.println("Enter no of list");
        int c=scn.nextInt();
        Node[] list=new Node[c];
        int i=0;
       while(i<c){
        System.out.println("enter no of nodes");
            int m=scn.nextInt();
            list[i]=creatList(m);
            i=i+1;
        }
        Node head=mergeKlist(list);
       printlist(head);
    }
}
