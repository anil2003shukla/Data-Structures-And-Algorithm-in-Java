public class RodcuttingLength {
    public static int rodcutting(int length[],int prices[],int totrod,int n){
        int dp[][]=new int[n+1][totrod+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<totrod+1;j++){
                if(i==0||j==0){
                dp[i][j]=0;
                }
            }
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<totrod+1;j++){
                if(j>=length[i-1]){
                    dp[i][j]=Math.max(prices[i-1]+dp[i][j-length[i-1]],dp[i-1][j]);
                              }
                              else{
                                dp[i][j]=dp[i-1][j];
                              }
            }
        }
        return dp[n][totrod];
    }
    public static void main(String[] args) {
        int price[]={1,5,8,9,10,17,17,20};
       int length[]={1,2,3,4,5,6,7,8};
       int n=price.length;
       int totrod=8;
       System.out.println(rodcutting(length,price,totrod,n));
    }
}
