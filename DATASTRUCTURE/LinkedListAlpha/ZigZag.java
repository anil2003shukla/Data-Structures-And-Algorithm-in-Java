public class ZigZag {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
                }
    }
    public static Node head;
    public static  Node tail;
    public static int size;
    public void addfirst(int data){
       //step1=create new node

        Node newNode=new Node(data);
        size++;
        if(head==null){
      head=tail=newNode;
      return;
        }
        
        //step2=newNode next=head
        newNode.next=head;//link
        //step3-head=newNode
        head=newNode;
    }
    
    public void addlast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
        }
        tail.next=newNode;
        tail=newNode;

    }
    public void addmiddle(int data,int indx){
       if(indx==0){
           addfirst(data);
           return;
       }
        Node newNode=new Node( data);
        size++;
        Node temp=head;
        int i=0;
        while(i<indx-1){
            temp=temp.next;
            i++;
        }
        //i=indx-1;temp->prev
        newNode.next=temp.next;
        temp.next=newNode;
    }
  
   public Node findmid(Node head){
         Node slow =head;
         Node fast=head;
         while(fast !=null && fast.next !=null){
            slow =slow.next;//+1
            fast=fast.next.next;//+2

         }
         return slow;//slow is my mindNode
   }
   
  public void zigzag(){
    //find mid
    Node slow =head;
    Node fast=head;
    while(fast !=null && fast.next !=null){
       slow =slow.next;//+1
       fast=fast.next.next;//+2

    }
    Node mid=slow;

    //reverse 2nd half
    Node curr=mid.next;
    mid.next=null;
    Node prev=null;
    Node next;
    while(curr !=null){
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;

    }
    Node left =head;
    Node right=prev;
    Node nextl,nextr;
   
    ///alt merge-zig zag merge
    while(left !=null && right !=null){
        nextl=left.next;
        left.next=right;
        nextr=right.next;
        right.next=nextl;
        left=nextl;
        right=nextr;

        
    }

  }
   public void print(){
    if(head==null){
        System.out.println("LL is epmty");
        return;
    }
    Node temp =head;
    while(temp !=null){
      System.out.print(temp.data+"->");
      temp=temp.next;
    }
    System.out.println("null");
}
    public static void main(String[] args) {
        ZigZag  ll=new ZigZag ();
        
      ll.addlast(1); 
      ll.addlast(2); 
      ll.addlast(3);
      ll.addlast(4);
      ll.addlast(5);
      ll.addlast(6);
      ll.addlast(7);
      ll.print();
      
      ll.zigzag();
      ll.print();

    }
}
