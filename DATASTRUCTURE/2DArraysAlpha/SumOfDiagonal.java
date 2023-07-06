public class SumOfDiagonal{
    public static void main(String[] args) {
        int matrix[][]={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        diagonalsumbruteforceapproach(matrix);
        diagonalsumoptimizeapproach(matrix);
    }
     static void diagonalsumbruteforceapproach(int matrix[][]){
            int n=matrix.length;
            int sum=0;
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(i==j){
                       sum +=matrix[i][j];
                    }
                    else if(i+j==n-1){
                        sum +=matrix[i][j];
                    }
                }
            }System.out.println(sum);
    }
    static void diagonalsumoptimizeapproach( int matrix[][]){
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            sum +=matrix[i][i];
            if(i!=matrix.length-1-i){
                sum +=matrix[i][matrix.length-1-i];
            }
        }
        System.out.println(sum);
    }
}