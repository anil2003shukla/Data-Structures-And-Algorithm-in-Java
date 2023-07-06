import java.util.PriorityQueue;
import java.util.*;

public class ADDINPRIORITYQUEUE{
    public static void main(String[] args) {
       PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder()) ;
     pq.add(3);//O(logn)
     pq.add(4);
     pq.add(1);
     pq.add(7);
     while(!pq.isEmpty()){
    System.out.println(pq.peek());//o(1)
       pq.remove();//o(logn)
     }
    }
}