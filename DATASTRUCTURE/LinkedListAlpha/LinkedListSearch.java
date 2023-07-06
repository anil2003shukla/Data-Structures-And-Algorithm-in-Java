public class LinkedListSearch {
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
    public int itrsearch(int key){
        Node temp=head;
        int i=0;
        while(temp !=null){
            if(temp.data==key){
                return i; 
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }
    public int helper(Node head,int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx=helper(head.next,key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }
    public int recSearch(int key){
        return helper(head,key);
    }
    public static void main(String[] args) {
        LinkedListSearch ll=new LinkedListSearch();
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
     System.out.println(ll.itrsearch(19)); 
     System.out.println(ll.itrsearch(3)); 
    System.out.println( "recursive="+ll.recSearch(5)); 

    }
}
