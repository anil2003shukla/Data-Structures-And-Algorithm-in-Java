public class QuickSort {
    public static void main(String[] args) {
        int arr[]={2,4,5,6,78,9,8,6};
        quicksort(arr,0,arr.length-1);
        printarr(arr);
    }
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void quicksort(int arr[],int si,int ei){
        //last element
        if(si>=ei){
            return;
        }
        int pidx=partition(arr,si,ei);
        quicksort(arr,si,pidx-1);//left
        quicksort(arr,pidx+1,ei);//right
    }
    public static int partition(int arr[],int si,int ei){
        int pivot=arr[ei];
        int i=si-1;//to make for else smaller than pivot
        for(int j=si;j<ei;j++){
            if(arr[j]<=pivot){
                i++;
                //swap
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        int temp=pivot;
        arr[ei]=arr[i];//pivot=arr[i]
        arr[i]=temp;
        return i;
    }
}
