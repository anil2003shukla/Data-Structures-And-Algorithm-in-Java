public class LinkedListAddElment{
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
    public static void main(String[] args) {
      LinkedListAddElment ll=new LinkedListAddElment();
        ll.print();
      ll.addfirst(2); 
      ll.print();
      ll.addfirst(1); 
      ll.print();
      ll.addlast(4);
      ll.print();
      ll.addlast(5);
      ll.print();
      ll.addmiddle(3,2);
      ll.print();
       System.out.println(size);

    }
}