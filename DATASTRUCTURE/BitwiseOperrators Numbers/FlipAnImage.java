import java.util.*;
public class FlipAnImage {
    public static  int[][] flipinvertimage(int image[][]){
for(int []row:image){
    //this array reverse 
    for(int i=0;i<image[0].length;i++){
        //swap
        int temp=row[i]^1;
        row[i]=row[image[0].length-i-1];
        row[image[0].length-i-1]=temp;  
      }
}
return image;
    }
    public static void main(String[] args) {
        int image[][]={
            {1,1,0},
            {1,0,1},
            {0,0,1}
        };
        int i=0;
     int ARR[][]=flipinvertimage(image);
     while(i<ARR.length){
        
        System.out.print(Arrays.toString(ARR[i])+"\n");   
   i++;
}
}
}
