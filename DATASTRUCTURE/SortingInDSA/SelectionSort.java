import java.util.*;
public class SelectionSort {
    public static void main(String args[]){
        int []arr={-3,-1,-5,2,4};
        
        selectionSort(arr);
        System.out.println("Sorted array is sorted in ascending order"+Arrays.toString(arr));
        selectionSorts(arr);
        System.out.println("Sorted array is in an descending order="+Arrays.toString(arr));

    }
    //ascending order of sort 
    static void selectionSort(int  []arr){
        //
        for(int i=0;i<arr.length;i++){
            //find thre maximum no int remaining array and swap with correct index
            int last =arr.length-i-1;
            int maxIndex=getMaxIndex(arr,0,last);
            swap(arr,maxIndex,last);
            
        }
    }
    static void swap(int []arr,int first,int second){
        int swap=arr[first];
        arr[first]=arr[second];
        arr[second]=swap;
    }
    private static int getMaxIndex(int []arr,int start,int end){
       int max=start;
       for(int i=start;i<=end;i++){
        if(arr[i]>arr[max]){
            max=i;
        }
       }
       return max;
    }
    //the array is sorted in the descending order
    static void selectionSorts(int  []arr){
        for(int i=0;i<arr.length;i++){
            //find thre maximum no int remaining array and swap with correct index
            int last =arr.length-i-1;
            int minIndex=getMinIndex(arr,0,last);
            swap(arr,minIndex,last);
            
        }
    }
    static void swaps(int []arr,int first,int second){
        int swap=arr[second];
        arr[second]=arr[first];
        arr[first]=swap;
    }
    private static int getMinIndex(int []arr,int start,int end){
        int min=start;
        for(int i=start;i<=end;i++){
         if(arr[i]<arr[min]){
             min=i;
         }
        }
        return min;
     }
}
