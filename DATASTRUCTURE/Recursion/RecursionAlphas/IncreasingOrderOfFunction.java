
public class IncreasingOrderOfFunction {
    public static void main(String[] args) {
        Incre(8);
    }
    public static void Incre(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        Incre(n-1);
        System.out.print(n+" ");
       
    
            
    }
}
