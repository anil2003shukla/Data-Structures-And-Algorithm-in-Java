import java.util.*;
public class MutiDimensionArray {
    public static void main(String args[]){
/* 1 3 4
   5 6 7
   8 9 10

 */
//int[][ ]arr=new int[3][3];
//int [][]arr2D={
 /*    { 1,2,3},//0th index 
    {4,5,},// 1st index
    {7,8,9,56} //2nd index->arr[2]={6,7,8,9}
};*/
//input
Scanner scan=new Scanner(System.in);
int [][] arr=new int[3][2];
System.out.println(arr.length);
for(int row=0;row<arr.length;row++){
    //for each column in every row 
    for(int col=0;col<arr[row].length;col++){
arr[row][col]=scan.nextInt();
    }
}
//for(int row=0;row<arr.length;row++){
    //for each column in every row 
   // for(int col=0;col<arr[row].length;col++){
//System.out.print(arr[row][col]+" ");
 //   }
  //  System.out.println();
  //System.out.println(Arrays.toString(arr[row]));

for(int[]b:arr){
   System.out.println(Arrays.toString(b));
}

    }
}