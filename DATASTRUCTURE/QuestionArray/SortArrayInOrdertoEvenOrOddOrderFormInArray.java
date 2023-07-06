import java.util.*;
public class SortArrayInOrdertoEvenOrOddOrderFormInArray {
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
    sortArrayInEvenAndOddForm(arr);
    System.out.println("SortedArray");
    printArray(arr);
}
static void  printArray(int [] arr){
    System.out.println(Arrays.toString(arr));       
       } 
       static void swap(int []arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void sortArrayInEvenAndOddForm(int [] arr){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            if(arr[left]%2!=0&&arr[right]%2==0){
                swap(arr,left,right);
                left++;
                right--;
            }
            if(arr[left]%2==0){
                left++;
            }
            if(arr[right]%2!=0){
                right--;
            }
        }
    }

}
