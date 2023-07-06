public class PrimeNo{
public static void main(String[] args) {
   int n=40;
   System.out.println("all the prime number less than 40");
    for(int i=1;i*i<=n;i++){
        if(isprime(i)){
            System.out.print(i+" ");
        }
    }
}
static boolean isprime(int n){
    if(n<=1){
        return false;
    }
    int c=2;
    while(c*c<=n){
        if(n%c==0){
                    return false;
        }
        c++;
    }
    return true;
}
}