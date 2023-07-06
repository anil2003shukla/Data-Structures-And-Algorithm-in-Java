import java.util.*;
public class FabonacciNo {
   public static void main(String args[]){
   Scanner scn=new Scanner(System.in);
   int num=scn.nextInt();
    int n=fib(num);
    System.out.println(n);
   }
   public static int fib(int n){
    if(n<=1){
        return n;
    }
   return fib(n-1)+fib(n-2);
   }
}
