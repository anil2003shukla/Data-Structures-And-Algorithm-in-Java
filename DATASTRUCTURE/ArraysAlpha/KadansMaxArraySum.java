public class KadansMaxArraySum {
    public static void main(String[] args) {
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        kandanes(arr);

    }
    static void kandanes(int arr[]){
            int max=Integer.MIN_VALUE;
            int cs=0;
            for(int i=0;i<arr.length-1;i++){
                cs=cs+arr[i];
                if(cs<0){
                    cs=0;
                }
                max=Math.max(max,cs);
            }

            System.out.println("our maximum subarray sum is :"+max);
    }
}
