public class HollowRhombus {
    public static void main(String args[]){
        hollowrhombus(5);
    }
    static void hollowrhombus(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<(n-i);j++){
                //spacesi
                System.out.print(" ");
            }
            //hollowrect
            for(int j=1;j<=n;j++){
       if(i==1||i==n||j==1||j==n){
       System.out.print("*");
       }
       else{
        System.out.print(" ");
       }
            }
            System.out.println();
        }
    }
}
