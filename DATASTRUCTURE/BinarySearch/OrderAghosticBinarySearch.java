public class OrderAghosticBinarySearch {
    public static void main(String args[]){
  int []arr={100,90,80,78,56,45,34,2,1,-1,-3,-4};
  int [] arrs={-4,-3,-1,1,2,34,45,56,78,80,90,100};
  int target=-4;
  System.out.println(" the lement is found at the index ="+" "+orderagnosticbinarysearch(arrs,target));
    }
    static int orderagnosticbinarysearch(int[] arr,int target){
        int s=0;
        int end=arr.length-1;
        // find whether array is sorted in ascending or descending
        boolean asfcnd=(arr[s]< arr[end]);
        
            
        while(s<=end){
            int mid=s+(end-s)/2;
            if(target==arr[mid]){
                return mid;
            }
            if(asfcnd){
                if(target<arr[mid]){
                    end=mid-1;
                   }
                 else {
                    s=mid+1;   
                    }
                }
            
            
            else{
                if(target>arr[mid]){
                    end=mid-1;
                }
               else{
                s=mid+1;
               } 
            }  
        }
        return -1;
    }
    }
