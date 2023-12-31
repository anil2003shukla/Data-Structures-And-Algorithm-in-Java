import java.io.*;
import java.util.*;
public class CountSort {
    public static void main(String args[]) throws Exception{
       Scanner scan =new Scanner(System.in) ;
       int n=scan.nextInt();
       int []arr=new int[n];
       int max=Integer.MIN_VALUE;
       int min=Integer.MAX_VALUE;
       for(int i=0;i<n;i++){
        arr[i]=scan.nextInt();
        max=Math.max(max,arr[i]);
        min=Math.min(min,arr[i]);
       }
       countSort(arr,min,max) ;
       prints(arr);
    }
    static void countSort(int arr[],int min ,int max){
  int range=max-min+1;
  int freq[]=new int[range];
  for(int i=0;i<arr.length;i++){
    int idx=arr[i]-min;
    freq[idx]++;
  }
  for(int i=1;i<freq.length;i++){
    freq[i]=freq[i]+freq[i-1];
  }
  int ans[]=new int[arr.length];
  for(int i=arr.length-1;i>=0;i--){
    int val=arr[i];
    int pos=freq[val-min];
    int idx=pos-1;
    ans[idx]=val;
    freq[val-min]--;
  }
  for(int i=1;i<freq.length;i++){
    freq[i]=freq[i]+freq[i-1];
  }
  for(int i=0;i<ans.length;i++){
    arr[i]=ans[i];
  }
    }
    static void prints(int arr[]){
        System.out.println("sorted array"+Arrays.toString(arr));
    }
    
}
