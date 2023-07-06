 import java.util.*;
 public class Amstrongno{
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int len=order(n);
        if(ArmstrongNo(n,len));
        System.out.println(n+" is the armstrong no");
    }
    public static int order(int n){
        int len=0;
        while(n !=0){
            len++;
            n=n/10;
        }
        return len;
    }
    public static boolean ArmstrongNo(int n,int len){
        int temp=n;
        int sum=0;
        while(temp !=0){
            int dig=temp%10;
            sum=sum+(int)Math.pow(dig,len);
            temp=temp/10;

        }
        return n==sum;
    }
 }