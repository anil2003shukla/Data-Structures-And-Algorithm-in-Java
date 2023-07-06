public class CheckCycleAndRemoveTheCycleInLinkedList {
    
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
public static boolean iscycle(){
    Node slow=head;
    Node fast=head;
    while(fast !=null &&fast.next !=null){
        slow=slow.next;//+1
        fast=fast.next.next;//+2
        if(slow==fast){
            return true;//cycle exists
        }
    }
    return false;//cycle does not exist
}
public static void removecycle(){
    //detect cycle
    Node slow=head;
    Node fast=head;
    boolean cycle=false;
    while(fast !=null && fast.next !=null){
       slow =slow.next;
       fast=fast.next.next;
       if(fast==slow){
       cycle=true;
       break;
       }
    }
    if(cycle==false){
        return;
    }
    // find meeting point
     slow =head;
      Node prev=null;//last node
      while(slow !=fast){
        prev=fast;
        slow=slow.next;
        fast=fast.next;
      }
        //remove cycle ->last.next=null
        prev.next=null;
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
       head=new Node(1);
      // head.next=new Node(2);
       Node temp=new Node(2);
       head.next=temp;
       head.next.next=new Node(3);
       head.next.next.next=temp;
       //1->2->3->1
       System.out.println(iscycle());
       removecycle();
       System.out.println(iscycle());
    }
    }
