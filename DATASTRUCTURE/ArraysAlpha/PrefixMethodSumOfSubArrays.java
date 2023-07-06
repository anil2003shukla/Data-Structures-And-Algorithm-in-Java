public class PrefixMethodSumOfSubArrays {
    public static void main(String[] args) {
         int arr[]={1,-2,6,-1,3};
         PrefixSumSubArrays(arr);
    }
    static void    PrefixSumSubArrays(int arr []){
        int max=Integer.MIN_VALUE;
        int cursum=0;
         int prefix[]=new int[arr.length];
         prefix[0]=arr[0];
         for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
         }
        for(int i=0;i<arr.length;i++){
            int start =i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                
                cursum= start == 0 ? prefix[end]:prefix[end]-prefix[start-1];
                if(cursum>max){
                    max=cursum;
                }
            }
                }
                System.out.println(" maximum sum="+max);
    }
}
