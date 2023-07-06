import java.util.*;
public class SelectionSortUsingRecursion {
    public static void main(String[] args) {
        int arr[]={4,9,0,1,2,89,5};
       int max=0;
        selection(arr,arr.length,0,max);
System.out.println(Arrays.toString(arr));

    }
    public static void selection(int arr[],int r,int c,int max){
        if(r==0){
            return;
        }
        if(c<r){
        if(arr[c]>arr[max]){
            selection(arr,r,c+1,c);
        }
        else{
            selection(arr,r,c+1,max);
        }
    }
        else{
            int temp=arr[r-1];
            arr[r-1]=arr[max];
            arr[max]=temp;
            selection(arr,r-1,0,0);
        }
    }
}
