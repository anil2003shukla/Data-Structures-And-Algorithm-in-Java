import java.util.*;
public class CopyRandomListWithRandomPointer {
    public static class Node{
  int val=0;
  Node next=null;
  Node random=null;
  public Node(int val){
    this.val=val;

  }
    }
   public static  Scanner scn=new Scanner(System.in);
    public static Node copyRandomList(Node head ){
        HashMap<Node,Node>map=new HashMap<>();
        Node curr=head;
        Node nhead=new Node(-1);
        Node prev=nhead;
        while(curr !=null){
           Node node=new Node(curr.val);
           prev.next=node;
           map.put(curr,node);
            prev=prev.next;
            curr=curr.next;
        }
        nhead=nhead.next;
       Node c1=head;
       Node c2=nhead;

        while(c1 !=null){
      c2.random=(c1.random !=null ?map.get(c1.random):null);
      c1=c1.next;
      c2=c2.next;
        }
        return nhead;
    }
    public static void main(String [] args)throws Exception{
       System.out.println("enter size of list");
        int n=scn.nextInt();
        Node[] arr=new Node[n];
        Node prev=null;
        for(int i=0;i<n;i++){
            arr[i]=new Node(0);
            if(prev !=null){
                prev.next=arr[i];}
      prev=arr[i]; 
            
        }
        for(int i=0;i<n;i++){
System.out.println("enter val");
            int val=scn.nextInt();
            System.out.println("enter random indx");
            int idx=scn.nextInt();
            arr[i].val=val;
            if(idx != -1) {
            arr[i].random=arr[idx];
            }
        }
        Node head=copyRandomList(arr[0]);
        while(head !=null){
            System.out.print(head.val+"->");
            head=head.next;
        }
    }
    
    
}
