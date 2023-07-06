public class TailingProblem {
    public static void main(String[] args) {
        System.out.print(tilingproblem(0));
    }
    public static int tilingproblem(int n){
        //kaam
        //vertical choice
        if(n==0||n==1){
            return 1;
        }
        int fnm1=tilingproblem(n-1);
        //horizontal
        int fnm2=tilingproblem(n-2);
         int totalways=fnm1+fnm2;
         return totalways;
    }
}
