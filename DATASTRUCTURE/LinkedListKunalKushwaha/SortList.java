public class SortList {
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
    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public void bubblesort(){
        bubblesort(size-1,0);
    }
    private void bubblesort(int row,int col){
        if(row==0){
            return;
        }
        if(col<row){
            Node first=get(col);
            Node second=get(col+1);
            if(first.data>second.data){
                //swap
                if(first==head){
                    head=second;
                    first.next=second.next;
                    second.next=first;

                }
                else if(second==tail){
                    Node prev=get(col-1);
                        prev.next=second;
                        tail=first;
                        first.next=null;
                        second.next=tail;
                    }
                    else{
                        Node prev=get(col-1);
                        prev.next=second;
                        first.next=second.next;
                        second.next=first;

                    }
                }
                bubblesort(row,col+1);
            }
            else{
                bubblesort(row-1,0);
            }
        }
    

   
    public static void main(String[] args) {
        SortList ll=new SortList();
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
       ll.bubblesort();
       ll.print();

    }  
}
