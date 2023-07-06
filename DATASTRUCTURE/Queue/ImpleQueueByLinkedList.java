public class ImpleQueueByLinkedList {
    static class Node{
        int data;
        Node next;
       Node(int data){
        this.data=data;
        this.next=null;
        }
    }
        static class Queue{
            static Node head=null;
             static Node tail=null;
 public static boolean isEmpty(){
    return head==null&&tail==null;
 }
    //add
    public static void add(int  data){
        Node newNode=new Node(data);
        if(head==null){
            head=tail=newNode;
        }
        tail.next=newNode;
        tail=newNode;
    }
    //remove
    public static int remove(){
        if(isEmpty()){
            System.out.println("empty queue");
            return -1;
        }
        int front=head.data;
        if(tail==head){
            tail=head=null;

        }
        else{
            head=head.next;
        }
        return front;
    }
    public static int peek(){
        if(isEmpty()){
            System.out.println("empty queue");
            return -1;
        }
        return head.data;
    }
              }
        public static void main(String[] args) {
            Queue q=new Queue();
            for(int i=9;i>0;i--){
                q.add(i);
            }
            while(! q.isEmpty()){
                System.out.println(q.remove());
              
            }
        }      
             
    }

