import javax.swing.text.Utilities;

public class FastExponentiation {
    public static void main(String[] args) {
         System.out.println(fastExponentiation(3,5)); 
    }
    public static int fastExponentiation(int a,int b){
        int c=1;
        while(a>0){
            if((a & 1)!=0){
               //lsb check
               c=c*b; 
            }
            b=b*b;
            a=a>>1;
        }
        return c;
    }
}
