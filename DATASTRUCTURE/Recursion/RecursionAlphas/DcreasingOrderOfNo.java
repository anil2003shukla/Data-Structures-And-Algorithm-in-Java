public class DcreasingOrderOfNo{
    public static void main(String[] args) {
        dcreaseinorder(8);
    }
    public static void dcreaseinorder(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        System.out.print(n+" ");
        dcreaseinorder(n-1);
    
            
    }
}