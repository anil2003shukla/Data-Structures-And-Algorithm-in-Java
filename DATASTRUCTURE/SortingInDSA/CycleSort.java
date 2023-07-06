import java.util.*;
public class CycleSort {
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
          
    }
    static void cyclicSort(int arr[]){
        int i=0;
        while(i<arr.length){
            int correctindex=arr[i]-1;
        if(arr[i]!=arr[correctindex]){
            swap(arr,i,correctindex);
           
        }  
    else{
        i++;
    }
    }
    }
    static void swap(int arr[],int first,int second){
        int temp=arr[first];
        arr[second]=arr[first];
        arr[first]=temp;
    }
}