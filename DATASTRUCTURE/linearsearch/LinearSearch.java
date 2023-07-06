
import java.util.*;
public class LinearSearch {
    public static void main(String argas []){
int [] nums ={1,2,3,4,5,6,7,87,98,67,54};
int target=4545;
 System.out.println(LinearSearchs(nums,target));
   }
    //search in the :array return the index if the target element found
    //otherwise return -1
    static int LinearSearchs(int [] arr,int target){
 if(arr.length==0){
    return Integer.MIN_VALUE;
 }
 //return for loop
 for(int i=0;i<arr.length;i++){
    //check for element at every index if it is ==target
    int element=arr[i];
    if(target==element){
        return i;
    }
 } 
 // this line exacute if one of them return statements above have executed
 // hence the target is not found
 return Integer.MAX_VALUE;
    }
}
