import java.util.*;
public class MaxAreInHistogram {
    public static void maximuimarea(int []arr){
        
   int maxarea=0;
   int []nsr=new int[arr.length];
   int []nsl=new int[arr.length];

      //next smaller right
      Stack<Integer> s=new Stack<>();
         for(int i=arr.length-1;i>=0;i--){
            while(! s.isEmpty()&&arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
            nsr[i]=arr.length;
            }else{
             nsr[i]=s.peek();
            }
            s.push(i);
         }
          //next smaller left
          s=new Stack<>();
          for(int i=0;i<arr.length;i++){
            while(! s.isEmpty()&&arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
            nsl[i]=arr.length;
            }
        else{
             nsl[i]=s.peek();
            }
            s.push(i);
         }

       //current area
                      for(int i=0;i<arr.length;i++){
                        int height=arr[i];
                        int width=nsr[i]-nsl[i]-1;
                        int curentarea=height*width;
                        maxarea=Math.max(curentarea,maxarea);
                      }
                      System.out.println("mAX AREA IN MYHISTOGRAM="+maxarea);
    }
    public static void main(String[] args) {
        int[] arr={2,1,5,6,2,3};
        maximuimarea(arr);
    }
}
