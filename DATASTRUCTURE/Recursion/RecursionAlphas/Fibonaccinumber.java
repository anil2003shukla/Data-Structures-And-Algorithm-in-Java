public class Fibonaccinumber {
    public static void main(String[] args) {
     System.out.println(fibo(25)); 
     System.out.println(fibo(26)); 
     System.out.println(fibo(27)); 
     System.out.println(fibo(28)); 
     System.out.println(fibo(29));   
    }
    public static int fibo(int n){
        if(n==0||n==1){
            return n;

        }
        int fib1=fibo(n-1);
        int fib2=fibo(n-2);
        int fibon=fib1+fib2;
        return fibon;
    }
}
