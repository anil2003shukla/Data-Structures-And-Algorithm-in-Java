import java.util.*;
public class BubbleSort{
    public static void main(String args[]){
        int arr[]={3,1,5,2,4};
        bubblesort(arr);
        System.out.println("Ascending order Sorted array="+Arrays.toString(arr));
        bubblesorts(arr);
        System.out.println("Descending order Sorted array="+Arrays.toString(arr));
    }
    //ascending order sorted array
    static void bubblesort(int []arr){
        boolean swapped;
        //run the steps n-1 times
        for(int i=0;i<arr.length;i++){
            swapped=false;
            for(int j=1;j<=arr.length-i-1;j++){
                //swap if the item is smaller than the previous item
                if(arr[j]<arr[j-1]){
                    //swap
                    int swap=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=swap;
                    swapped=true;
                }
            }
            //if you did not swap the for a particular value of i,it means the array is already sorted hence stop program
            if(!swapped){
                break;
            } 
        }
    }
    // Descending order soting array
    static void bubblesorts(int []arr){
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<=arr.length-1-i;j++){
                if(arr[j]>arr[j-1]){
                    int swap=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=swap;
                }
            }
        }
    }
}