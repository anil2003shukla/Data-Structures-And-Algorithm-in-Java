import java.util.*;
public class StackQueueUsing {
    static class Stack{
        Deque<Integer> deque=new LinkedList<>();
        public void push(int data){
            deque.addLast(data);
        }
        public int pop(){
           return deque.removeLast(); 
        }
        public int peek(){
            return deque.getLast();
        }
        
    }
    static class Queue{
        Deque<Integer> dq=new LinkedList<>();
        public void qadd( int data){
            dq.addLast(data);
           
           

        }
        public int RemoveQueue(){
          return  dq.removeFirst();
        }
        public int peek(){
           return dq.getFirst();
        }

        }
    
    public static void main(String[] args) {
        Stack s=new Stack();
        Queue q=new Queue();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println("peek="+s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        q.qadd(1);
        q.qadd(2);
        q.qadd(3);
        System.out.println("peek="+q.peek());
       
        System.out.println(q.RemoveQueue());
        System.out.println(q.RemoveQueue());
        System.out.println(q.RemoveQueue());
    }
}
