public class N_Queen {
    static int count=0;
 public static void   nQueens(char board[][],int rows){
    //base case
    if(rows==board.length){
        printBoard(board);
        count++;
        return;
    }
    //colmn
    for(int j=0;j<board.length;j++){
        if(isFase(board,rows,j)){
            board[rows][j]='Q';
        nQueens(board,rows+1);//function call
        board[rows][j]='X';//backtraking step
        }
    }  
    }
    public static boolean isFase(char board[][],int rows,int col){
      //vertical up
     for(int i=rows-1;i>=0;i--){
        if(board[i][col]=='Q'){
            return false;
        }
     }
      //diagonal left up
       for(int i=rows-1,j=col-1;i>=0 &&j>=0;i--,j--){
        if(board[i][j]=='Q'){
            return false;
        }
       }
      //diagonal right up;
      for(int i=rows-1,j=col+1;i>=0&&j<board.length;i--,j++){
        if(board[i][j]=='Q'){
            return false;
        }
    }
    return true;
    }
    public static void printBoard(char board[][]){
        System.out.println("--------------Chess BOARD--------------------------");
    for(int i=0;i<board.length;i++){
        for(int j=0;j<board.length;j++){
            System.out.print(board[i][j]+" ");
        }
        System.out.println(" ");
    }
    }
   public static void main(String[] args) {
    int n=4;
 char  board[][]=new char[n][n];
    for(int i=0;i<board.length;i++){
       for(int j=0;j<board.length;j++){
 board[i][j]='x';
        }
        
    } 
   nQueens(board,0);
   printBoard(board);
   System.out.println(count);
   } 
}
