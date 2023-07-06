public class SearchInMatrix{
    public static void main(String[] args) {
         int matrix [][]={
            { 10,20,30,40},
            {15,25,35,45},
            {27,29,37,48},
            {32,33,39,50}
         };
         staircaseSearch(matrix,50);
    }
    public static boolean staircaseSearch(int matrix[][],int key){
        int row=0,col=matrix.length-1;
        while(matrix.length > row && col>=0){
            if(matrix[row][col]==key){
                System.out.println("found th key at ("+row+","+col+")");
                return true;
            }
            else if(key < matrix[row][col]){
                col--;
            }
            else{
                row++;
            }

        }
        return false;
    }
}