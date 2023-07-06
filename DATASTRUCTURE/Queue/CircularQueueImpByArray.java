public class CircularQueueImpByArray {
    static class Queue{
        static int arr[];
        static int size;
        static int rear;
        static int front;
        Queue(int n){
            arr=new int[n];
            rear=-1;
            front =-1;
            size=n;
        }
        public static boolean isEmpty(){
            return rear==-1 &&front==-1;
        }
        public static boolean isFull(){
            return (rear+1)%size==front;
        }
        public static void add(int data){
            if(isFull()){
                System.out.println("Circular Queue is full");
                return;

            }
            if(front ==-1){
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=data;
        }
        //remove
        public static int remove(){
            if(isEmpty()){
                    System.out.println("empty queue");
                    return -1; 
            }
            int result=arr[front];
            
           // delete last element;
           if(rear==front){
            rear=front=-1;
           }
           else{

            front=(front+1)%size;
           
        }
        return result;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("empty queue");
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String[] args) {
        Queue q=new Queue(6);
        for(int i=0;i<6;i++){
            q.add(i);
        }
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
