public class SearchInMountain {
    public static void main(String args[]){
int[]arr={1,2,3,4,5,6,45,25,22,14,10};
int target=78;
System.out.println("index where elment exist in the array ="+search(arr,target));
    }
    static int search(int []arr,int target){
        int peak=findthepeakelementinmountainarray(arr);
        int firstTry=orderagnosticbinarysearch(arr,target,0,peak);
        if(firstTry !=-1){
            return firstTry;
        }
       return orderagnosticbinarysearch(arr,target,peak+1,arr.length-1);
    }
    static int findthepeakelementinmountainarray(int [] arr){
        int start=0;
         int end=arr.length-1;
         while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1] ){
                // you are in dec pART OF THE ARRAY
                //THIS MAY BE ANSWER,BUT TOOK OTHER PARTS OF THE ARRAY
                //THIS IS WHY END!=MID-1
             end= mid;
            }
               
            
            else{
                // you are in asc part of the array
                start=mid+1;//beacuse we know that mid+1 element>element mid 
              }
         }
         // int the end ,start=end and point to the largest number of the the 2 checks above 
         // start and end are always trying to find max element in te above 2 chwecks
         //hence ,when they are pointing to just one element ,that is the maximum one
         // more aloboration; at every point of time for start and end they have the best posible ans till that time and if we RE SAYING THAT ONLY ITEM IS REMAINING hence, above line that is the best posible answer
        
         return start;
            }
            static int orderagnosticbinarysearch(int[] arr,int target,int s,int end){
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
