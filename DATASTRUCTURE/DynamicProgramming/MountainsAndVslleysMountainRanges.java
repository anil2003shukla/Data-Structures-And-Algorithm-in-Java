public class MountainsAndVslleysMountainRanges {
    public static long mountainRanges(int n){
        long dp[]=new long[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<n+1;i++){
            for(int j=0;j<i;j++){
            long insidepairs=dp[j];
            long outside=dp[i-j-1];
            dp[i] +=insidepairs*outside;
        }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n=4;
System.out.println("mountain ranges="+mountainRanges(n));
    }
}
