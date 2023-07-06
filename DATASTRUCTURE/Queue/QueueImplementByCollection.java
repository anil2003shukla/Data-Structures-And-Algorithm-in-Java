import java.util.*;
public class QueueImplementByCollection {
    public static void main(String[] args) {
       Queue<Integer> q=new LinkedList<>();//ArrayDeque
       Stack<Integer> s=new Stack<>();
            for(int i=9;i>0;i--){
                q.add(i);
                s.add(i);
            }
            while(!q.isEmpty()){
                System.out.print(q.peek()+" ");
                q.remove();
            }
            System.out.println();
          while( !s.isEmpty()) {
                System.out.print(s.peek()+" ");
                s.pop();

            }
    }
}
