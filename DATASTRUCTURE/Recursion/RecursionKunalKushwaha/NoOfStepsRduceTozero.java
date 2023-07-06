public class NoOfStepsRduceTozero {
    public static void main(String[] args) {
     System.out.println( Nosteps(7));  
    }
    static int Nosteps(int n){
        return helper( n,0);
    }
   static int helper(int n,int s){
    if(n==0){
        return s;
    }
     if(n%2==0){
        return helper(n/2,s+1);
     }
     else{
        return helper(n-1,s+1);
     }
    }
}
