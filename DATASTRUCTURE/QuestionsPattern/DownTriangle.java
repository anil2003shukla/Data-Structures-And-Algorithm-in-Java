public class DownTriangle {
    static int n=5;
    public static void main(String args[]){
     
        for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
         System.out.print("*"+"  ");
        }
            System.out.println();
       }
    }
}
