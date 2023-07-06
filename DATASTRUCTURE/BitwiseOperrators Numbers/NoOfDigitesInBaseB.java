public class NoOfDigitesInBaseB {
    public static void main(String[] args) {
        int n=9;
        int base=4;
        int ans=(int)(Math.log(n)/ Math.log(base))+1;
        System.out.println(ans);
    }
}
