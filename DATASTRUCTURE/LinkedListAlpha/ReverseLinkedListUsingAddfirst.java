import java.util.*;
public class ReverseLinkedListUsingAddfirst {
    static class Node{
        int val;
        Node next=null;
        public Node( int val){
            this.val=val;
        }

    }
    static Node th=null;
    static Node tt=null;
    static Node reverse(Node head){
        Node curr=head;
        while(curr !=null){
            Node flow=curr.next;
            curr.next=null;
            addfirst(curr);
            curr=flow;
        }
        return th;
    }
    public static void addfirst(Node node){
        if(th==null){
            th=node;
            tt=node;
        }
        else{
            node.next=th;
            th=node;
        }
    }
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        Node dummy=new Node(-1);
        Node prev=dummy;
        while(n-- > 0){
            prev.next=new Node(scn.nextInt());
            prev=prev.next;
            
        }

        Node head=reverse(dummy.next);
        while(head !=null){
            System.out.print(head.val+"->");
            head=head.next;
        }
    }
    
}
