import java.util.*;
public class FindSecondMaxInArray {
   public static void main(String args[]){
    Scanner scan=new Scanner(System.in);
    System.out.println("Please Enter no of element in the array");
    int n=scan.nextInt();
    int arr[]=new int[n];
    System.out.println("Pleaase Enter the elements in the array");
    for(int i=0;i<n;i++){
     arr[i]=scan.nextInt();
    }
    System.out.println(findsecondMax(arr));
   } 
   static int maximum(int[] arr){
    int n=arr.length;
    int max=Integer.MIN_VALUE;
    for(int i=0;i<n;i++){
      if(arr[i] >max){
    max=arr[i];
      }
    }
  return max;
   }
   static int findsecondMax(int []arr){
    int max=maximum(arr);
    for(int i=0;i<arr.length;i++){
        if(arr[i]==max){
            arr[i]=Integer.MIN_VALUE;
        }
    }
    int secondmax=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
        if(arr[i]>secondmax){
            secondmax=arr[i];
        }
    }
    return secondmax;
   }
}
