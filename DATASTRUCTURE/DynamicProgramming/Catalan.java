import java.util.*;
public class Catalan {
    public static int catalan(int n){
        if(n==0||n==1){
            return 1;
        }
        int ans=0;
        for(int i=0;i<=n-1;i++){
            ans +=catalan(i)*catalan(n-1-i);
        }
        return ans;
    }public static long catalanmemoi(int n,long dp[]){
        if(n==0|n==1){
            return 1; 
        }
        if(dp[n]!=-1){
              return dp[n];
        }
        int ans=0;
        for(int i=0;i<n;i++){
            ans +=catalanmemoi(i,dp)*catalanmemoi(n-1-i,dp);
            
        }
        dp[n]=ans;
        return dp[n];
    } 
    public static long catalantab(int n){
       long dp[]=new long [n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<n+1;i++){
            for(int j=0;j<i;j++){
                dp[i] +=dp[j]*dp[i-j-1];//ci=cj*ci-j-1

            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n=30;
      long dp[]=new long[n+1];
        Arrays.fill(dp,-1);
       // System.out.println((catalan(n)));
             System.out.println(catalanmemoi(n,dp));
             //System.out.println(catalantab(n));
    }
}//3814986502092304
