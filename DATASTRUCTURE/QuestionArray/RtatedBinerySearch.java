public class RtatedBinerySearch {
    public static void main(String args[]){
int []arr={4,5,6,7,0,1,2};
int target=0;
System.out.println(Search(arr,target));
    }
     static int Search(int[] nums,int target){
        int pivot=findpivot(nums);
      // if you don't have pivot it means the array is not rotated
      if(pivot==-1){
        //just do normal binary search 
        return binerysearch(nums,target,0,nums.length-1);

      }
      // if pivot is found ,you have found 2 asc sorted arrays
      if(nums[pivot]==target){
        return pivot;
      }
      if(target>=nums[0]){
        return binerysearch(nums,target,0,pivot-1);
      }
     return binerysearch(nums,target,pivot+1,nums.length-1);
     }
     static  int binerysearch(int[] arr, int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
     }
    static int findpivot(int []arr){
        int start =0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            //here 4 cases over
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid] < arr[mid-1]){
              return mid-1;
            }
            if(arr[mid]<=arr[start]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }

        }
        return -1;
    }
}
