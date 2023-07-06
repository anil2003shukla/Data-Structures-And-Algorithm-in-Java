public class RemoveDuplicateElmentInll{
   
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
    public void duplicates(){
        Node node=head;
        while(node.next !=null){
            if(node.data==node.next.data){
                node.next=node.next.next;
                size--;
            }
            else{
                node=node.next;
            }
        }
        tail=node;
        tail.next=null;
    }
    
    public static void main(String[] args) {
        RemoveDuplicateElmentInll ll=new RemoveDuplicateElmentInll();
        ll.addlast(1);
        ll.addlast(1);
        ll.addlast(1);
        ll.addlast(4);
        ll.addlast(4);
        ll.addlast(2);
        ll.addlast(2);
        ll.addlast(2);
        ll.addlast(9);
        ll.print();
        ll.duplicates();
       ll.print();


    }
}