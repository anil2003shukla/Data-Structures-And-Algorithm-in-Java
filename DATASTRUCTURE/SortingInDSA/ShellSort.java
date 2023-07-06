import java.util.*;
public class ShellSort {
    public static void main(String args[]){
        int arr[]={12,3453,465,65,7687,9};
        Shellsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void Shellsort(int []arr){
        int n=arr.length;
        for(int gap=n/2;gap>0;gap/=2){
            for(int i=gap;i<n;i++){
                int temp=arr[i];
              int  j=i;
                while(j>=gap && arr[j-gap]>temp){
                    arr[j]=arr[j-gap];
                    j-=gap;
                }
                arr[j]=temp;
            }
        }
    }
}
