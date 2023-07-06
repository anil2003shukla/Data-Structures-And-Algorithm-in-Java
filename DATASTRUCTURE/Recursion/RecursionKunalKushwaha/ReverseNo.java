public class ReverseNo {
    public static void main(String[] args) {
        reverse(45);
        System.out.println(sum);
    System.out.print( reverse2(454));   
        
    }
    //ways 1
    static int sum=0;
    public static void  reverse(int n){
       
        if(n==0){
            return ;
        }
         int rem=n%10; 
        sum=sum*10+rem;
        reverse(n/10);
      
    }
   // ways-2
   static int  reverse2(int n){
    // sometimes you might need some additional varialbles in argument 
    //int that case,make another function
    int digits=(int)(Math.log10(n)+1);
    return helpper(n,digits);
   }
   private static int helpper(int n,int digits){
       if(n%10==n){
        return n;
       } 
       int rem=n%10;
       return rem*(int)Math.pow(10,digits-1)+ helpper(n/10,digits-1);
   }
}
