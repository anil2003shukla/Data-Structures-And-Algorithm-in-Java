
import java.util.*;
public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      //  int n=sc.nextInt();
      //  int m=sc.nextInt();
    int matrix[][]={{1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,16},
                   };
                spiralmatrix(matrix);  
         
        }
    static void spiralmatrix(int matrix[][]){
        System.out.println("The spiral order of matrix is : ");
        int rowStart=0;
        int rowEnd=matrix.length-1;
        int colStart=0;
        int colEnd=matrix.length-1;

        while(rowStart<=rowEnd && colStart<=colEnd){
            for (int col = colStart; col <= colEnd; col++) {
                System.out.print(matrix[rowStart][col]+" ");
            }
            
          for(int j=rowStart+1; j<=rowEnd; j++){
                System.out.print(matrix[j][colEnd]+" ");
            }
           
            for(int col=colEnd-1; col>=colStart; col--){
                if(rowStart==rowEnd){
                    break;
                }
                System.out.print(matrix[rowEnd][col]+" ");
            }
           
            for(int row=rowEnd-1;row>rowStart;row--){
                if(colStart==colEnd){
                    break;
                }
                System.out.print(matrix[row][colStart]+" ");
            }   
            rowStart++;
            colStart++;
            colEnd--;
            rowEnd--;
           
        }

    }
    

    }

