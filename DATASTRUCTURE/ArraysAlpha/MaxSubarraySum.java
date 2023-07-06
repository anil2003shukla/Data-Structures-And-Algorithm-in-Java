public class MaxSubarraySum {
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        subarrays(arr);

    }
    static void subarrays(int arr[]){
        int sum=0;
         int max=Integer.MIN_VALUE;
        int n=arr.length;
        int start,end;
        for(int i=0;i<n;i++){
            start=i;
            for(int j=i;j<n;j++){
                end=j;
                sum=0;
                for(int k=start;k<=end;k++){
                  // sub arrays sum     
                 sum +=arr[k];
                }
                System.out.println(sum);
                if(sum>max){
                    max=sum;
                }
            }
           
        }
        System.out.println("max sum ="+max);
        
    }
}
