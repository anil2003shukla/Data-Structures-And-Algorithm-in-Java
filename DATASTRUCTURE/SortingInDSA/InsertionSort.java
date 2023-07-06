import java.util.*;
public class InsertionSort {
    public static void main(String args[]){
        int [] arr={3,5,-04,1,-2};
        insertionsort(arr);
        System.out.println("The sorted array is in ascending order="+Arrays.toString(arr));
        insertionsorts(arr);
        System.out.println("The sorted array is in descending order="+Arrays.toString(arr));

    }
    //array is sorted in descending order
    static void insertionsort(int []arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=1+i;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
                else{
                    break;
                }
            }
        }
    }
 static void swap(int arr[],int first,int second){
        int swap=arr[first];
        arr[first]=arr[second];
        arr[second]=swap;
    }
    //descending order sorting 
    static void insertionsorts(int []arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=1+i;j>0;j--){
                if(arr[j]>arr[j-1]){
                    swap(arr,j,j-1);
                }
                else{
                    break;
                }
            }
        }
    }
    static void swapdesceding(int arr[],int first,int second){
        int swap=arr[second];
        arr[second]=arr[first];
        arr[first]=swap;
    }
}
