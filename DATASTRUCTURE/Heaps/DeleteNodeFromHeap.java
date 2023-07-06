import java.util.*;
public class DeleteNodeFromHeap {
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
                x=parent;
                parent=(x-1)/2;
             }
          
           
       
        }
        private void heapify(int i){
            int left=2*i+1;
            int right=2*i+2;
            int minidx=i;
            if(left<arr2.size()&&arr2.get(minidx)>arr2.get(left)){
                minidx=left;
            }
            if(right<arr2.size()&&arr2.get(minidx)>arr2.get(right)){
                minidx=right;
            }
            if(minidx!=i){
                //swap
                int temp=arr2.get(i);
                arr2.set(i,arr2.get(minidx));
                 arr2.set(minidx,temp);
                heapify(minidx);
            }
        }
        public  int peek(){
            return arr2.get(0);
        }
        public int remove(){
            int data=arr2.get(0);
            int temp=arr2.get(0);
            //step1-swap first and last
            arr2.set(0,arr2.get(arr2.size()-1) );
            arr2.set(arr2.size()-1,temp);
            //step delete last
            arr2.remove(arr2.size()-1);
            //step3
            heapify(0);
            return data;
        }
        public boolean isEmpty(){
            return arr2.size()==0;
        }
    }
        public static void main(String[] args) {
            heap hp=new heap();
            int arr[]={3,4,1,5};
            for(int i=0;i<arr.length;i++){
                hp.add(arr[i]);
            }
          //  hp.add(3);
          ///  hp.add(4);
          //  hp.add(1);
         //   hp.add(5);
            while(!hp.isEmpty()){
                System.out.println(hp.peek());
                hp.remove();
            }
           
        }
}
