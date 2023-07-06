public class ButterFlyPattern {
    public static void main(String args[]){
        butterfly(7);
    }
    public static void butterfly(int n){
        //firstHalf
        for(int i=1;i<=n;i++){
            // starts- 1
            for(int j=1;j<=i;j++){
      System.out.print("*");
            }
            //for spaces
            for( int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //stars-i
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
                      }
                      //for spaces
                      for( int j=1;j<=2*(n-i);j++){
                          System.out.print(" ");
                      }
                      //stars-i
                      for(int j=1;j<=i;j++){
                          System.out.print("*");
                      }
                      System.out.println();
        }
    }
}
