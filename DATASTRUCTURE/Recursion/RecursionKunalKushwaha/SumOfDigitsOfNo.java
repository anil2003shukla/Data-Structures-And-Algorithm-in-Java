public class SumOfDigitsOfNo {
    
public static void main(String[] args) {
   
  System.out.println( sumdigits(843)); 
}
public static int sumdigits(int n){
            if(n==0){
                return 0;
            }
            return (n%10)+sumdigits(n/10);
}
}
