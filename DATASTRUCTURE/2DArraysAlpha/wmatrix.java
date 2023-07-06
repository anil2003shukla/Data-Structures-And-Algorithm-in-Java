public class wmatrix {
    public static void main(String[] args) {
        
   
    int matrix[][]={
        {1,2,3,4,5,6,7,8,9,10},
        {11,12,13,14,15,16,17,18,19,20},
        {21,22,23,24,25,26,27,28,29,30},
        {31,32,33,34,35,36,37,38,39,40},
        
    };
    patern(matrix);
}
static void patern(int matrix[][]){
   
        for(int j=0;j<matrix[0].length;j++){
            if(j%2==0){
                for(int i=0;i<matrix.length;i++){
                    if(i==j){
                        System.out.print(matrix[i][j]+" ");
                    }
                   else if(i+j==6){if(i!=j){
                        System.out.print(matrix[i][j]+" ");}
                    }
                  else  if(j-i==6){if(i!=j){
                        System.out.print(matrix[i][j]+" ");}
                    }
                   
                }
               
                    }
                    
                    else{
                        for(int i=matrix.length-1;i>=0;i--){
                            if(i==j){
                                System.out.print(matrix[i][j]+" ");
                            }
                           else if(i+j==6){if(i!=j){
                                System.out.print(matrix[i][j]+" ");}
                            }
                          else  if(j-i==6){if(i!=j){
                                System.out.print(matrix[i][j]+" ");}
                            }
                                  ;
                        }
                      
                    }
          
        
    }
}
}
