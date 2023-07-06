public class InvertedAndRotatedHalfPiramid {
    public static void main(String args[]){
        halfpyramid(4);
    }
    public static void halfpyramid(int n){
        for(int i=1;i<=n;i++){
            //print spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //print stars
            for(int j=1;j<=i;j++){
            System.out.print("8");
        }
        

        System.out.println();
    }
    }
}
