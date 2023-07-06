public class CheckThePlendromicListOrNo {
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
   public Node findMid(Node head){
    //helper
    Node slow=head;
    Node fast=head;
    while(fast !=null && fast.next !=null){
        slow=slow.next;//+1
        fast=fast.next.next;//+2
    }
       return slow;//slow is myNode
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
   
   public boolean checkpanlindrome(){
      if(head ==null||head.next==null){
        return true;
      }
    //step -find mid
    Node minNode=findmid(head);
    //reverse 2nd halfe
    Node prev =null;
    Node curr=minNode;
    Node next;
      while(curr!=null){
      next=curr.next;
      curr.next=prev;
      prev=curr;
      curr=next;
   }
   Node right=prev;
   Node left =head;//right half head
   // step 3-check left half &right half;
   while(right !=null){
    if(left.data !=right.data){
        return false;
    }
    left=left.next;
    right=right.next;
   }
   return true;
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
        CheckThePlendromicListOrNo ll=new CheckThePlendromicListOrNo();
        
      ll.addfirst(2); 
      
      ll.addfirst(1); 
      
      ll.addlast(2);
      
     // ll.addlast(1);
      
     // ll.addmiddle(3,2);
      ll.print();
    
     System.out.println(ll.checkpanlindrome());
       

    }
}
