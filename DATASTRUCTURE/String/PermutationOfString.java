public class PermutationOfString{
    public static void main(String[] args) {
        permutation("aefghi");
    }
    public static void permutation(String str){
        int   n=str.length();
        int f= factorial(n);
        for(int  i=0;i<f;i++){
            StringBuilder sb=new StringBuilder(str);
        int  temp=i;
        for(int  div=n;div>=1;div--){
           int  quatient=temp/div;
           int  r=temp%div;
        System.out.print(sb.charAt(r));
        sb.deleteCharAt(r);
        temp=quatient;
        }
        System.out.println();
        } 

    } 
    public static int factorial(int  n){
        int val=1;
        for(int  i=2;i<=n;i++){
            val *=i; 
        }
       
      return val;
    }
}