import java.util.Scanner;
import java.util.*;
public class NoOfPairsEqualsToTargetSum {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int targetsum=7;
        System.out.println("Please Enter no of element in the array");
        int n=scan.nextInt();
        int arr[]=new int[n];
        System.out.println("Pleaase Enter the elements in the array");
        for(int i=0;i<n-1;i++){
         arr[i]=scan.nextInt();
        }
        System.out.println(pairs(arr,targetsum));
    }
    static int pairs(int []arr,int targetsum){
       int n=arr.length;
       int sum=0;
       int ans=0;
       for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
          
            if(arr[i]+arr[j]==targetsum){
                ans++;
            }
           
        }
       }
       return ans;
    }
   
}
