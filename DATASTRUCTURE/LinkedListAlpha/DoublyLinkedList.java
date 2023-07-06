public class DoublyLinkedList {
    public class Node{
        int data;
        Node next;
        Node prev;

   
    public Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;

    }
}
public static Node head;
public static Node tail;
public static int size;
public void addfirst(int data){
    Node newNode=new Node(data);
    size++;
    if(head==null){
        head=tail=newNode;
        return;

    }
    newNode.next=head;
    head.prev=newNode;
    head=newNode;
}
//print
public void print(){
    Node temp=head;
    while(temp !=null){
       System.out.print(temp.data+"<->"); 
       temp=temp.next;
    }
    System.out.println("null");
}//remove
public int removefirst(){
    if(head==null){
        System.out.println("Dll is empty");
        return Integer.MIN_VALUE;

    }
    if(size==1){
        int val=head.data;
        head=tail=null;
        size--;
        return val;

    }
     int val=head.data;
     head=head.next;
     head.prev=null;
     size--;
     return val;
}
public void reverse(){
    Node curr=head;
    Node prev=null;
    Node next;
    while(curr !=null){
        next=curr.next;
        curr.next=prev;
        curr.prev=next;
        prev=curr;
        curr=next;

    }
    head=prev;
}
    public static void main(String[] args) {
        DoublyLinkedList  dll=new DoublyLinkedList();
        dll.addfirst(9);
        dll.addfirst(8);
        dll.addfirst(7);
        dll.addfirst(6);
        dll.addfirst(4);
        dll.addfirst(3);
        dll.addfirst(2);
        dll.print();
        System.out.println(size);
       // System.out.println(dll.removefirst());
      //  dll.print();
     //   System.out.println(size);
     dll.reverse();
     dll.print();
       
    }
}
