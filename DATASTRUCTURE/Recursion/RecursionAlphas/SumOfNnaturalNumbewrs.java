public class SumOfNnaturalNumbewrs {
    public static void main(String[] args) {
       System.out.println(sumnatural(6)); 
    }
    public static int sumnatural(int n){
        if(n==0){
            return 0;
        }
        int sumn_1s=sumnatural(n-1);
        int sumnnaturalnumber= n+sumnatural(n-1);
        return sumnnaturalnumber;
    }
}
