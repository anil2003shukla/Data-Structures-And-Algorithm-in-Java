import java.util.*;
public class CountZerosAndOnceInArray {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter no of element in the array");
        int n=scan.nextInt();
        int arr[]=new int[n];
        System.out.println("Pleaase Enter the  "+ n+ " elements in the array");
        for(int i=0;i<n;i++){
         arr[i]=scan.nextInt();
        }
        System.out.println("Original array :");
        printArray(arr);
        sortZeroesAndOnes(arr);
        System.out.println("SortedArray");
        printArray(arr);
    }
    static void printArray(int arr[]){
     System.out.println(Arrays.toString(arr));       
    }
    
    static void sortZeroesAndOnes(int []arr){
        int n=arr.length;
        int zeroes=0;
        //count number pf zeroes
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                zeroes++;
            }
        }
      for(int i=0;i<n;i++){
        if(i<zeroes){
            arr[i]=0;
        }
        else{
            arr[i]=1;
        }
      }
        //0-zeroes:0,zeroes to n-1;
    }
}
