import java.util.*;
public class SearchElement{
    public static void main(String[] args) {
       int arr[]={3,6,6,7,6,78,6,435};
       int index=0,target=435;
       // System.out.println(find(arr,index,target));
       // System.out.println(finds(arr,index,target));
        findsall(arr,0,6);
        System.out.println(list);
    }
    static boolean find(int arr[],int index,int target){
        if(index==arr.length){
            return false;
        }
        return arr[index]==target||find(arr,index+1,target);
    }
    static int finds(int arr[],int index,int target){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        else{
            return finds(arr,index+1,target);
        }
        
    }
    //find all indexs of duplicate element in array 
     static  ArrayList<Integer> list=new ArrayList<>();
     static void  findsall(int arr[],int index,int target){
        if(index==arr.length){
            return ;
        }
        if(arr[index]==target){
                        list.add(index);
        }
        else{
            findsall(arr,index+1,target);
        }
        }
        
    }

