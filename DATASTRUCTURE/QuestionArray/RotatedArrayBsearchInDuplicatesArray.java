public class RotatedArrayBsearchInDuplicatesArray {
    public static void main(String args[]){
        int []arr={4,5,6,7,-1,0,1,2,3};
        int target=-1;
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
             //this will not work for duplicate valiues
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


static int findpivotwithDuplicates(int []arr){
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
        //if element at middle,start,end are equal then just skip the duplicates
        if(arr[mid]==arr[start]&&arr[mid]==arr[end]){
           //slips the duplicats

           //Note what is these element at start and end were the pivot??
           //checks if start is pivot
           if(arr[start]>arr[start+1]){
            return start;
           }
           start++;
           //check end is pivot
           if(arr[end]<arr[end-1]){
            return end-1;
           }
           end--;
        }
        //left side is sorted ,so pivot should be in right
        else if(arr[start]<arr[mid]||(arr[start]==arr[mid]&&arr[mid]>arr[end])){
            start=mid+1;
        }
        else{
            end=mid-1;
        }
       

    }
    return -1;
}

}