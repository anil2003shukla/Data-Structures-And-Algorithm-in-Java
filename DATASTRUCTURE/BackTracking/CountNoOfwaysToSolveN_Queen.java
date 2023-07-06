public class CountNoOfwaysToSolveN_Queen {
    static int count=0;
    public static void countQueen(char b[][],int r){
      //base case
        if(r==b.length){
            count++;
            return;
        }
        //coll
        for(int j=0;j<b.length;j++){
            if(isFase(b,r,j)){
                b[r][j]='Q';
                countQueen(b,r+1);
                b[r][j]='X';
            }
        }
       
    }
    public  static boolean isFase(char b[][],int r,int col){
        //vertical up
        for(int i=r-1;i>=0;i--){
            if(b[i][col]=='Q'){
                return false;
            }
        }
        //diagonal left up
        for(int i=r-1,j=col-1;i>=0&&j>=0;i--,j--){
            if(b[i][j]=='Q'){
                return false;
            }
        }
        //diagonal right up
        for(int i=r-1,j=col+1;i>=0&&j<b.length;i--,j++){
            if(b[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n=4;
        char b[][]=new char[n][n];
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b.length;j++){
                b[i][j]='X';
            }
        }
        countQueen(b,0);
        System.out.println(count);
    }
}
