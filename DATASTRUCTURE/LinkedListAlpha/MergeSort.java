public class MergeSort {
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
    private Node merge(Node head1,Node head2){
        Node mergell=new Node(-1);
        Node temp=mergell;
        while(head1!=null &&head2 !=null){
            if(head1.data<=head2.data){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }
            else{
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }

        }
        while(head1 !=null){
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
        }
        while(head2 !=null){
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
        }
        return mergell.next;
    }
    private Node getmid( Node head){
        Node slow=head;
        Node fast=head.next;
        while(fast !=null &&fast.next !=null){
            slow =slow.next;
            fast=fast.next.next;

        }
        return slow;
    }
      public Node mergeSort( Node head){
        if(head==null || head.next ==null){
          
            return head;
        }
        //find mid
        Node mid=getmid(head);

        //left &right ms
        Node rightHead=mid.next;
        mid.next=null;
        Node newleft=mergeSort(head);
        Node newright=mergeSort(rightHead);
        //merge
        return merge(newleft,newright);
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
        MergeSort ll=new  MergeSort();
        
      ll.addfirst(8); 
      
      ll.addfirst(9); 
      
      ll.addlast(10);
      
      ll.addlast(11);
      
      ll.addmiddle(3,4);
     ll.print();
     ll.head=ll.mergeSort(ll.head);
       ll.print();

    }
}
