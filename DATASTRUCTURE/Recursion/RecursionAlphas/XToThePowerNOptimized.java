public class XToThePowerNOptimized {
    public static void main(String[] args) {
       long a=2,n=18;
        System.out.println(poweropti(a,n));
    }
    public static long poweropti(long a,long n){
        if(n==0){
            return 1;
        }
        long halfpower=poweropti(a,n/2);
           long halfsq=halfpower*halfpower;
        if(n%2!=0){
                   halfsq=a*halfsq;
        }
        return halfsq;
    }
}
