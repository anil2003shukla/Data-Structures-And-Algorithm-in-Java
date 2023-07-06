import java.util.*;
public class InsertInHeap {
   static class heap{
    ArrayList<Integer> arr2=new ArrayList<>();
    public  void add(int data){
        //add at last idx
        arr2.add(data);
        int x=arr2.size()-1;//zx is child index
        int parent=(x-1)/2;//parent index
         while(arr2.get(x)<arr2.get(parent)){//O(logn)
            int temp=arr2.get(x);
          //swap
            arr2.set(x,arr2.get(parent));
            arr2.set(parent,temp);
            
         }
      
       
   
    }
    public  int peek(){
        return arr2.get(0);
    }
}
    public static void main(String[] args) {
        heap hp=new heap();
        int arr1[]={2,3,5,10,4};
        for(int i=0;i<arr1.length;i++){
        hp.add(arr1[i]);
        }
       
    }
}
