public class HollowRectangle {
   public static void hollow_rect(int totrows,int tocols){
        for(int i=1;i<=totrows;i++ ){
            for(int j=1;j<=tocols;j++){
                if(i==1||i==totrows||j==tocols||j==1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int totrows=4,tocols=5;
        hollow_rect(4,5);
    }
}
