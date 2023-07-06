 public class MergeSort{
    public static void main(String[] args) {
        int arr[]={6,3,9,5,2,8};
        mergeSort(arr,0,arr.length-1);
        printsortedArr(arr);
    }
    public static void printsortedArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void mergeSort(int arr[] ,int si,int ei){
        //kaam
        if(si>=ei){
            return; 
         }
        int mid=si+(ei-si)/2;
        mergeSort(arr,si,mid);//left part
        mergeSort(arr,mid+1,ei);//rightpart
        merge(arr,si,mid,ei);
    }
    public static void merge(int arr[],int si,int mid,int ei){
           //left(0,3) right(4,6)=3->6-0+1
           int temp[]=new int[ei-si+1];
       
        int i=si;//iterator for the left part
    
        int j=mid+1;;//itrator for the right part
        int k=0;//iterator for the arr
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
              
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
           
        }//left part only
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        //right part
        while(j<=ei){
            temp[k++]=arr[j++];

        }
        //copy temp arr into original array
        for( k=0,i=si;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }
 }