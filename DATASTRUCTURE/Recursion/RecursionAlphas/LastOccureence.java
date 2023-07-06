public class LastOccureence {
    public static void main(String[] args) {
       int arr[]={1,3,4,5,6,7,8,9,0};
       int i=0,key=0;
       System.out.println( lastoccu(arr,i,key));
    }
    public static int lastoccu(int arr[],int i,int key){
        if(i==arr.length){
            return -1;
        }
        int isfound=lastoccu(arr,i+1,key);
        if(arr[i]==key&&isfound==-1){
            return i;
        }
        return isfound;
    }
}
