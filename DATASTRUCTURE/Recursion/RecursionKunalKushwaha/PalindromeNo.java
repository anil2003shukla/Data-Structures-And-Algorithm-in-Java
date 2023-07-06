public class PalindromeNo {
    public static void main(String[] args) {
       
     System.out.print( palindromic(12344321));  
    }
    static int reverse(int n){
        int digits=(int)(Math.log10(n)+1);
        return helpper(n,digits);

     }
     static int helpper(int n,int digits){
        if(n%10==n){
            return n;
        }
       int rem=n%10;
       return rem*(int )Math.pow(10,digits-1)+helpper(n/10,digits-1); 
    }
    static boolean palindromic(int n){
        return  n==reverse(n);
    }
}
