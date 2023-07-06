import java.util.*;
public class FindUniqueNoInArray {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
    System.out.println("Please Enter no of element in the array");
    int n=scan.nextInt();
    int arr[]=new int[n];
    System.out.println("Pleaase Enter the elements in the array");
    for(int i=0;i<n;i++){
     arr[i]=scan.nextInt();
    }
   System.out.println(findunique(arr));
    //int targetsum=scan.nextInt();
    }
    static int findunique(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
            if(arr[i]==arr[j]){
                arr[i]=-1;
                arr[j]=-1;
            }
        }
        }
        int ans=-1;
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                ans=arr[i];
            }
        }
        return ans;
    }
}
