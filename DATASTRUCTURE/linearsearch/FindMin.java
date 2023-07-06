public class FindMin{
    public static void main(String args[]){
    int[] arr={3,54,67,89,98,-1};
    System.out.println(min(arr));
    
}
//asume array is not min
static int min( int[]arr){
    int min=arr[0];
    for(int i=1;i<arr.length;i++){
        if(arr[i]<min){
            min=arr[i];
            
        }
    }
    return min;
}

}