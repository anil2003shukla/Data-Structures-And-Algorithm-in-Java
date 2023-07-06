import java.util.*;
public class FindTheFirstAndLastPositionInGivenSortedArray {
    public static void main(String args[]){
        int []nums={5,7,7,8,8,10};
        int target=8;
int []result=searchRange(nums,target);

        System.out.println(" fisrt and last index of given array"+(Arrays.toString(result)));
    }
    static int[] searchRange(int [] nums,int target){
        int[]ans={-1,-1};
        ans[0]=search(nums,target,true);
        if(ans[0]!=-1){
        ans[1]=search(nums,target,false);
        }
       return ans;
       
    }
    // this founction just return the index value of target
    static  int search(int []nums, int target,boolean findfirstindex){
        int ans=-1;
        int start=0;
        int end=nums.length;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>nums[mid]){
                start=mid+1;
            }
            else if(target<nums[mid]){
                end=mid-1;
            }
            else{
                //potential position is found
                ans=mid;
                if(findfirstindex==true){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
               
            }
        }
        return ans;
    }
}
