import java.util.*;
public class TictacToeGame {
    public static void main(String[] args) {
        char[][] board=new char[3][3];
        for(int row=0;row<board.length;row++){
            for(int col=0;col<board[row].length;col++){
                board[row][col]=' ';

            }
        }
        char player='x';
        boolean gameover=false;
        Scanner scan=new Scanner(System.in);
        while(!gameover){
            printTheBoard(board);
            System.out.println("Plyer "+player+"    enter");
            int row=scan.nextInt();
            int col=scan.nextInt();
            if(board[row][col]==' '){
   //place the element
            board[row][col]=player;
            gameover=haveown(board,player);
            if(gameover){
                System.out.println("Plyer "+player+"has own");  
            }
            else{ 
                /*  if(player=='x'){
                    player='o';
                }
                else{
                    player='x';
                }*/
                player=(player=='x')?'o':'x';
            }
            }
            else{
                System.out.println("Invalid move try again");
            }
        }
        printTheBoard(board);
    }
    static boolean haveown(char[][] board,char player){
        //check the rows
        for(int row=0;row<board.length;row++){
            if(board[row][0]==player&&board[row][1]==player&&board[row][2]==player){
                return true;
            }
        
        }//col
        for(int col=0;col<board[0].length;col++){
            if(board[0][col]==player&&board[1][col]==player&&board[2][col]==player){
                return true;
            }
        
        }
        //diagonal
        if(board[0][0]==player&&board[1][1]==player&&board[2][2]==player){
           return true;
        }
        if(board[0][2]==player&&board[1][1]==player&&board[2][0]==player){
            return true;
         }
     return false;
    }
  public   static void printTheBoard(char board  [][]){
    for(int row=0;row<board.length;row++){
        for(int col=0;col<board[row].length;col++){
           System.out.print(board[row][col]+" | ");

        }
        System.out.println();
    }
  }
}
