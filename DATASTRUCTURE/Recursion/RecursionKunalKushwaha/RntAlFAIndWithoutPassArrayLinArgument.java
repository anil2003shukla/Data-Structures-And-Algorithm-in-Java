import java.util.*;
public class RntAlFAIndWithoutPassArrayLinArgument{
    public static void main(String[] args) {
      int arr[]={3,4,4,4,4,4,5,6,7,8,98,9,8};
        System.out.println(findAllIndex(arr,4,0)); 
    }
    static ArrayList<Integer>  findAllIndex(int arr[],int target,int index){
         ArrayList<Integer> list=new ArrayList<>();
         if(index==arr.length){
            return list;
         }
         //this will containanswer for that call only
         if(arr[index]==target){
            list.add(index);
         }
            ArrayList<Integer> ansFromBelowCalls=findAllIndex(arr,target,index+1);
        list.addAll(ansFromBelowCalls);
        return list;
    }
}