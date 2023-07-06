public class ExitProblemMatrix {
    public static void main(String[] args) {
         int arr[][]={
            {0,0,1,0},
            {1,0,0,1},
            {0,0,0,1},
            {1,0,1,0}
         };
         exitmatrixproblem(arr);
    }
    public static void exitmatrixproblem(int arr[][]){
        int dir=0;//0-e,1-s,2-w,3-N
      int  i=0;
      int j=0;
        while(true){
            dir=(dir+arr[i][j])%4;
            if(dir==0){//east
                j++;
            }
            else if(dir==1){//south
                i++;
            }
            else if(dir==2){//west
                j--;
            }
            else if(dir==3){//north
                i--;
            }
            if(i<0){
                i++;
                break;
            }
            else if(j<0){
                j++;
                break;
            }
            else if(j==arr[0].length){
                j--;
                break;
            }
            else if(i==arr.length){
                i--;
                break;
            }
        }
     System.out.println("("+i+","+j+")");
    }
}
