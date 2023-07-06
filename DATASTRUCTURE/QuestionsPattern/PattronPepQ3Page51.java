import java.util.*;
public class PattronPepQ3Page51 {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for(int i=1;i<=n;i++){
            //for spaces
            for(int j=1;j<=i-1;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=1;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        System.out.println("This is second pattern");
        for(int i=1;i<=n;i++){
            //for spaces
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=1;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
