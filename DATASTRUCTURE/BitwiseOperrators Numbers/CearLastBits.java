public class CearLastBits {
   public static void main(String[] args) {
    System.out.println(clearIthBite(15,2));
    System.out.println(13|8);
   }
   public static int clearIthBite(int n,int i) {
   int biTMASK=(~0)<<i;
   return n&biTMASK;
   }
   
}
