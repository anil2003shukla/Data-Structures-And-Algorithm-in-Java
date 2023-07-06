
import java.util.PriorityQueue;
import java.util.*;
public class PQForObject {
    public static   class Student implements Comparable<Student> {//overrinding
        String name;
        int rank;
        public Student(String name,int rank){
            this.name=name;
            this.rank=rank;

        }
        @Override
        public   int compareTo(Student s2){
       return this.rank-s2.rank;
        }

    }
    public static void main(String[] args) {
        PriorityQueue<Student> pq=new PriorityQueue<>(/*//Comparator.reverseOrder()*/);
        pq.add(new Student("A",1));//O(logn)
        pq.add(new Student("B",5));
        pq.add(new Student("C",2));
        pq.add(new Student("D",4));
        while(!pq.isEmpty()){
       System.out.println(pq.peek().name+"->"+pq.peek().rank);//o(1)
          pq.remove();//o(logn)
        }  
    }
}
