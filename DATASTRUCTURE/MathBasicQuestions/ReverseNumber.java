import java.util.*;
public class ReverseNumber{
public static void reverseNo(int num){
    if(num<0){
        num=num*-1;
    }
     if(num==0){
            return ;
        }
        int rem=num%10;
        System.out.print(rem);
        reverseNo(num/10);

}
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int number=sc.nextInt();
    if(number<0){
        System.out.print("-");
    }
    reverseNo(number);
}
class  Main
{
    public static void main (String[]args)
    {

        //variables initialization
        int num = -1234;
        boolean isNegative = num < 0 ? true: false;

        if (isNegative) {
            System.out.print("-");
            num = num * -1;
        }

        getReverse(num);
    }

    static void getReverse(int num)
    {
        if (num == 0)
            return;

        int rem = num % 10;
        System.out.print(rem);

        getReverse(num / 10);

    }
}
}