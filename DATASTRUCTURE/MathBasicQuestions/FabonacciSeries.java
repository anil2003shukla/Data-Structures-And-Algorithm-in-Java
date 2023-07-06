import java.util.*;
public class FabonacciSeries {
    public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int a=0;int b=1;int c;
for(int i=0;i<num;i++){
    System.out.print(a+" ");
    c=a+b;
    a=b;
    b=c;
}
    }
}
