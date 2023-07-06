import java.util.*;
public class ReturnArrayListOfIndexs {
    public static void main(String[] args) {
       int arr[]={4,5,5,5,56,7,64,53,0,4,4,4,4};
     System.out.print(findAllIndex(arr,4,0,new ArrayList<>()));   
    }
   public  static ArrayList<Integer> findAllIndex(int arr[],int target,int index,ArrayList<Integer> list){
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
     return   findAllIndex(arr,target,index+1,list);
    }
}
