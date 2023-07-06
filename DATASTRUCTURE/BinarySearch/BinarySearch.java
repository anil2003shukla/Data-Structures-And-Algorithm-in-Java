public class BinarySearch{
    public static void main(String args[]){
   int arr[]={-100,-99,-80,-4,1,2,3,4,5,67,87,100};
   int target=-100;
   System.out.println(" the number is found the index \n"+binarySearch(arr,target));
    }
    // return the index
    // return -1 is the number is not exist
    static int binarySearch(int []arr,int target){
        int s=0;
        int end=arr.length;
        while( s<=end){
//find the middle element
//int mid=(s+end)/2;//might be possible that (s+end)/2 exceed the limit of ineger
       int mid =s+(end-s)/2;
       if(target<arr[mid]){
        end=mid-1;
       }
     else  if( target>arr[mid]){
        s=mid+1;   
        }
     else{
        // ans found mid
        return mid;
     }
        }
        return -1;
    }
}