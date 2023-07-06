public class DeleteNthNode {
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
   public void deleteNthFromEnd(int n){
    //calculate size
    int sz=0;
    Node temp=head;
    while(temp !=null){
        temp=temp.next;
        sz++;
    }
    if(n==sz){
       head=head.next;//removeFirst
        return;
    }
    //sz-n
    int i=1;
    int iTofind=sz-n;
     Node prev=head;
     while(i<iTofind){
        prev=prev.next;
        i++;
     }
       prev.next=prev.next.next;
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
        DeleteNthNode ll=new DeleteNthNode();
        
      ll.addfirst(2); 
      
      ll.addfirst(1); 
      
      ll.addlast(4);
      
      ll.addlast(5);
      
      ll.addmiddle(3,2);
      ll.print();
      ll.deleteNthFromEnd(3);
      ll.print();
     
       

    }


}
