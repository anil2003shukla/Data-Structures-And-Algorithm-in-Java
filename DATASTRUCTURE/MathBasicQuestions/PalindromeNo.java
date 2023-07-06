import java.util.*;
public class PalindromeNo {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println(isPalindrome("radar".toLowerCase()));
        System.out.println(isPalindrome("12321".toLowerCase()));
        System.out.println(isPalindrome("radar".toLowerCase()));


    }
    private static boolean isPalindrome(String s){
        String reversed=new StringBuilder(s).reverse().toString();
        return s.equals(reversed);
    }
}
