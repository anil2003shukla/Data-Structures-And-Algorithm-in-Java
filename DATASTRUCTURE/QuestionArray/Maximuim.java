

public class Maximuim {
    public static void main(String args[]){
        int []arr ={2,4,56,76,89,9};
        System.out.println(Max(arr ,1,5));
        }
        static int Max(int[] arr ,int start, int end){
            if( end>start){
                return -1;
            }
            if(arr.length==0){
                return -1;
            }
            int maxvalue=arr[0];
for(int i=1;i<arr.length;i++){
    if(arr[i]>maxvalue){
        maxvalue=arr[i];
    }
}
return maxvalue;
        }
    }

