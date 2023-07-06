import java.util.*;
import java.io.*;
public class RedixSort {
    static void redixSort(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int val:arr){
            if(val>max){
                max=val;
           }
        }
        int exp=1;
        while(exp<=max){
            countSort(arr,exp);
            exp= exp*10;
        }

    }
    public static void countSort(int []arr,int exp){
        //make the frequency array
        int freq[]=new int[10];
  for(int i=0;i<arr.length;i++){  
    freq[arr[i]/ exp % 10]++;
  }  
  //convert into prefix array
  for(int i=1;i<freq.length;i++){
    freq[i]=freq[i]+freq[i-1];
  }//stable sorting(filling ans array)
  int ans[]=new int[arr.length];
  for(int i=arr.length-1;i>=0;i--){
    int pos=freq[arr[i]/ exp % 10]-1;
    ans[pos]=arr[i];
    freq[arr[i]/ exp % 10]--;
  }//filling the original array with help of ans array
  for(int i=0;i<ans.length;i++){
    arr[i]=ans[i];
  }
  System.out.print("After sorting on="+exp+"  place ->");
  print(arr);
    }
    public static void print(int arr[]){
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String args[]){
        Scanner scan =new Scanner(System.in) ;
       int n=scan.nextInt();
       int []arr=new int[n];
       for(int i=0;i<n;i++){
        arr[i]=scan.nextInt();
       }
       redixSort(arr);
       print(arr);
    }
}
