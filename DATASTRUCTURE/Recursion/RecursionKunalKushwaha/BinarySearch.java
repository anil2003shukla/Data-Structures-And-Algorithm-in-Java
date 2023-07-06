public class BinarySearch {
    public static void main(String[] args) {
       int arr[]={2,4,5,6,7,8,6,6,4,6};
       int target=6;
       int  l=arr.length;
        System.out.println(binarysearch(arr,0,l,target));
    }
    public static int binarysearch(int arr [],int s,int e,int target){
        
        if(s>e){
            return -1;
        }
        int m=s+(e-s)/2;
        
                if(arr[m]==target){
                    return m;
                }
                if(arr[m]>target){
                 return  binarysearch( arr , s, m-1, target);
                }
                else{
                    return  binarysearch( arr , m+1, e, target);
                                 }
    }
}
