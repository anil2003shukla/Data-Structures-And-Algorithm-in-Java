import java.util.*;
public class MergeKlistInSingleListUsingPriorityQueue {
    public static Scanner scn=new Scanner(System.in);
    public static class Node{
        int val=0;
        Node next=null;
        public Node(int val){
            this.val=val;
        }
    }
    public static Node mergeKlist(Node[] lists){
    //deefault behaviour:Min PQ
    PriorityQueue<Node >pq=new PriorityQueue<>((a,b)->{
        return a.val-b.val;//this-other ,for default behaviour,
        //return b.val-a.val;//other-this,for reverse of defoult behaviour
    });
    for(Node l:lists){
        if(l !=null){
            pq.add(l);
        }
    }
        Node dummy=new Node(-1);
        Node prev=dummy;
        while(pq.size()!=0){
            Node node=pq.remove();
         prev.next=node;
         prev=prev.next;
         node=node.next;
         if(node !=null){
            pq.add(node);
         }
        }
        return prev.next;
    
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
