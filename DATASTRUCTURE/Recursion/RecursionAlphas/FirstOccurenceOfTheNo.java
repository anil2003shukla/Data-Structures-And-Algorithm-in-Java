public class FirstOccurenceOfTheNo {
    public static void main(String[] args) {
        int arr[]={2,43,6,7,8,9,5,3};
        int key=8;
        int i=0;
      System.out.println(firstoccu(arr, i, key));  
    }
    public static int firstoccu(int arr[],int i,int key){
        if(i==arr.length){
                    return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstoccu(arr,i+1,key);
    }
}
