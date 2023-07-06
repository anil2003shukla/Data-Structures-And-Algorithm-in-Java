import java.util.*;
public class ClimbingStairs {
    //memoization O(n)|recursion(2^n)->n=10^5;
    public static long  ways(int n,long  ways[]){
        if(n==0){
            return 1;
        }
        if(n<0){
            return 0;
        }
        if(ways[n]!=-1){//already calculated
            return ways[n];
        }
    ways[n]=  ways(n-1,ways)+ways(n-2,ways);
    return ways[n];
    }
    public static int countway(int n){
        int dp[]=new int[n+1];
        dp[0]=1;
        //tabulation loop
        for(int i=1;i<=n;i++){
            if(i==1){
           
            dp[i]=dp[i-1]+0;
            }
        else{
            dp[i]=dp[i-1]+dp[i-2];
        }
    }
return dp[n];
    
    }
    public static void main(String[] args) {
        int  n=5;//n=3->&n=4=>8
       long ways[]=new long[n+1];// 0 0 0 0 0 0 0
        Arrays.fill(ways,-1);
       // System.out.print(ways(n,ways));
        System.out.println(countway(5));
        System.out.println(ways(n,ways));
    }
}
