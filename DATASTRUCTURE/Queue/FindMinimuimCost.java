import java.util.*;
public class FindMinimuimCost {
    static int mincost(int arr[],int size){
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
        }
        int result=0;
        while(pq.size()>1){
         int first=pq.poll();
         int second=pq.poll();
         result +=first+second;
         pq.add(first+second);
        }
        return result;
    }
    public static void main(String args[]){
        int arr[]={4,3,2,6};
        int size=arr.length;
        System.out.println(mincost(arr,size));
    }
}
