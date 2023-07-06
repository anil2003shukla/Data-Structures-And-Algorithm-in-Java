public class PrintSubarrays {
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        subarrays(arr);

    }
    static void subarrays(int arr[]){
        int sum=0;
        int n=arr.length;
        int start,end;
        for(int i=0;i<n;i++){
            start=i;
            for(int j=i;j<n;j++){
                end=j;
                for(int k=start;k<=end;k++){
                       
                  System.out.print(arr[k]+" "); 
                }
                System.out.println();
            }
            System.out.println();
        }
        
    }
}
