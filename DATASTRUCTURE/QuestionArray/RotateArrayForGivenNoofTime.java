import java.util.*;
public class RotateArrayForGivenNoofTime {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter no of element in the array");
        int n=scan.nextInt();
        int arr[]=new int[n];
        System.out.println("Pleaase Enter the elements in the array");
        for(int i=0;i<n;i++){
         arr[i]=scan.nextInt();
        }
        System.out.println("Please Enter no whatever time you want to rotate the array");
        int k=scan.nextInt();
        System.out.println("Original array");
        printArray(arr);
        int ans[]=rotate(arr,k);
        System.out.println("After rotation array ");
        printArray(ans);
    }
    static int [] rotate(int []arr,int k){
        int n=arr.length;
        k=k%n;
        int j=0;
        for(int i=n-k;i<n;i++){
            arr[j++]=arr[i];
        }
        for(int i=0;i<n-k;i++){
            arr[j++]=arr[i];
        }
        return arr;
    }
  static void  printArray(int []arr){

    System.out.println(Arrays.toString(arr));
  }
}
