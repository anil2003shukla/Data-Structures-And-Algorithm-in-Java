
import java.util.*;
public class Reversearrays {
    public static void main(String args[]){
        int [] arr={1,3,4,34,6,18};
        System.out.println("the orignal array");
        System.out.println(Arrays.toString(arr));
       // swap(arr ,0,5);
       reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int [] arr){
        int start=0;
        int end=arr.length -1;
while(start<end){
    swap(arr,start,end);
    start++;
    end--;
}
    } 
    static void swap(int [] arr,int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }
}
