import java.util.*;
public class SortSquaresOfArrayElements {
    
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
        int []ans=sortSquares(arr);
        reverse(ans);
        System.out.println("SortedArray");
        printArray(ans);
    }
    static void  printArray(int [] arr){
        System.out.println(Arrays.toString(arr));       
           } 
           static void reverse( int [] arr){
            int i=0;
            int j=arr.length-1;
            while(i<j){
                swap(arr,i,j);
                i++;
                j--;
            }
           }
           static void swap(int []arr,int i,int j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    static    int [] sortSquares(int[]arr){
       int n=arr.length;
       int left=0;
       int right= n-1;
       int ans[]=new int[n];
       int k=0;
       while(left<=right){
        if(Math.abs(arr[left])> Math.abs(arr[right])){
            ans[k++]=arr[left]*arr[left];
            left++;
        }
        else{
            ans[k++]=arr[right]*arr[right];
            right--;
        }
       }
       return ans;
        }
}
