import java.util.*;
public class RotateAraayWithoutUaseOfExtraSpace {
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
        rotateInPlace(arr,k);
        System.out.println("After rotation array ");
        printArray(arr);
    } 
   static void printArray(int []arr){
    System.out.println(Arrays.toString(arr));
   }
    static void rotateInPlace(int []arr,int k){
        int n=arr.length;
        k=k%n;
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);

    }
    static void reverse(int []arr,int i,int j){
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    static void swap(int[] arr,int i,int j){
        arr[i]=arr[i] + arr[j];
        arr[j]=arr[i]-arr[j];
        arr[i]=arr[i]-arr[j];
    }

    }

