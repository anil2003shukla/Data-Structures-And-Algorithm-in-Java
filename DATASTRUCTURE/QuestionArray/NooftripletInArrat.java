import java.util.*;
public class NooftripletInArrat {
public static void main(String args[]){
    Scanner scan=new Scanner(System.in);
    System.out.println("Please Enter no of element in the array");
    int n=scan.nextInt();
    int arr[]=new int[n];
    System.out.println("Pleaase Enter the elements in the array");
    for(int i=0;i<n;i++){
     arr[i]=scan.nextInt();
    }
    System.out.println("Enter the TargetSum");
    int targetsum=scan.nextInt();
    System.out.println(tripletsum(arr,targetsum));
}
static int tripletsum(int[]arr,int target){
    int n=arr.length;
    int ans=0;
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            for(int k=j+1;k<n;k++){
                if(arr[i]+arr[j]+arr[k]==target){
                    ans++;
                }
            }
        }
    }
    return ans;
}
}
