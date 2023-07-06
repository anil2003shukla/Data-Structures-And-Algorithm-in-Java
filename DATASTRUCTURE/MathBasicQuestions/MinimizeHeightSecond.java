import java.util.*;
import java.util.Arrays;

public class MinimizeHeightSecond {
   
   static void getMinDiff(int[] arr, int n, int k) {
        // code here
        Arrays.sort(arr);
        
        for(int i=0;i<n;i++){
            if(i==0||arr[i]<=k){
                arr[i]=arr[i]+k;
            }
            else{
                
                arr[i]=arr[i]-k;
            }
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
       
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int  n=sc.nextInt();
        int k=sc.nextInt();
        int arr[] =new int[n];
        for(int i=0;i<n;i++){
             arr[i]=sc.nextInt();
        }
        getMinDiff(arr,n,k);
    }
}

