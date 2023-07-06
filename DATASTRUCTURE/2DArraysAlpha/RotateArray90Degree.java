import java.util.*;

import javax.swing.plaf.synth.SynthOptionPaneUI;
public class RotateArray90Degree {
    public static void main(String[] args) {
    char arr[][]={
            {'a','b','c','d'},
            {'e','f','g','h'},
            {'i','j','k','l'},
            {'m','n','o','p'}
            
        };
        matrix(arr);
       

    }
    public static void matrix(char arr[][]){
        //transpose of matix
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr[0].length;j++){
                char temp=arr[i][j];
                arr[i][j]=arr[j][i];
              arr[j][i]=temp;
            }
}
  for(int i=0;i<arr.length;i++){
    int li=0;
    int ri=arr[i].length-1;
    while(li<ri){
        char temp=arr[i][li];
        arr[i][li]=arr[i][ri];
      arr[i][ri]=temp;
      li++;
      ri--;
    }

}
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[0].length;j++){
           System.out.print(arr[i][j]+" ");
        }
   System.out.println();
  }
    }
   
}
