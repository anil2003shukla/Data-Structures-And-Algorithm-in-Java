public class CycleSortQ1MissinNoFind{
    public static void main(String[] args) {
        int arr[]={5,0,2,4,1};
        cyclicSort(arr);
      System.out.println(findmissingNo(arr));  


    }
    static void cyclicSort(int arr[]){
       int i=0;
       while(i<arr.length){
        int current=arr[i];
        if(arr[i]<arr.length && arr[i]!=arr[current]){
            swap(arr,i,current);

        }
        else{
            i++;
        }
       }
    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int  findmissingNo(int arr [] ){
       for(int i=0;i<arr.length;i++){
        if(arr[i]!=i){
            return i;
        }
       }
        

        // case 2
        return arr.length;
    }
    }
