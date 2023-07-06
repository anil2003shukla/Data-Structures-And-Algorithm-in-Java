public class EvenOrOdd{
    public static void main(String[] args) {
        int n=65;
        System.out.println(isOdd(n));
    }
    public static boolean isOdd(int n){
        boolean flag=(n&1)==1;
    return flag;
    }

}