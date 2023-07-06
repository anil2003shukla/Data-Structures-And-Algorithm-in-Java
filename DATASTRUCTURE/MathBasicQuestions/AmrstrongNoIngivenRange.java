import java.util.Scanner;

public class AmrstrongNoIngivenRange {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter lower and upper ranges : ");
        int low = sc.nextInt();
        int high = sc.nextInt();
         System.out.println("Armstrong numbers between "+ low + " and " + high + " are : ");
         for(int num=low;num<=high;num++){
            int len=order(num);
            if(isArms(num,len)){
                System.out.print(num+" ");

            }

         }
    }
    public static int order(int num){
        int len=0;
        int temp=num;
        while(temp !=0){
            len++;
            temp/=10;
        }
        return len;
    }
    public static boolean isArms(int num,int len){
        int sum=0,dig;
        int temp=num;
        while(temp !=0){
            dig=temp%10;
            sum+=(int)Math.pow(dig,len);
            temp=temp/10;
        }
        return num==sum;
    }
}
