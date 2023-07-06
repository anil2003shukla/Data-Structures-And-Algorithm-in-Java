import java.util.*;
public class FindpimeFactorsOfGivenNo {
    static int count =0;
   public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);

    int n=sc.nextInt();
    PrimeFactors(n);
    System.out.println(count);
   } 
   public static void PrimeFactors(int n){
    for(int i=2;i<n;i++){
        if(isPrime(i)==1){
            int x=n;
            while(x%i==0){
                count++;
                System.out.print(i+" ");
              
                x /=i;
            }
        }
    }
   }
   private static int isPrime(int num){
      for(int i=2;i<num;i++){
        if(num%i==0){
            return 0;
        }
      

      }
      return 1;
   }
}
