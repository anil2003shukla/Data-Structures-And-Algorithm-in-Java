import java.util.*;
public class SearchIn2DArray {
    public static void main(String args[] ){
        int [][]arr={
            {45,76,43},
            {43,67,32},
            {32,54,67,89,54},
            {18,56}

        };
        int target=45;
        int []ans= search(arr,target);
        System.out.println(Arrays.toString(ans));
       System.out.println(" Maximuim value of the aaray \n"+max(arr));
    }
    static int[] search(int [][]arr,int target){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr[i].length-1;j++){
                if(arr[i][j]==target){
                    return  new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }// find the maximuim value of the array
    static int max( int [][]arr){
        int max=arr[0][0];
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr[i].length-1;j++){
                if(arr[i][j]>max){
                    max=arr[i][j];
                   
                }
            }
        }
       return max;
    }
}
