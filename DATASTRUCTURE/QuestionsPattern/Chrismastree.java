public class Chrismastree {
    public static void main(String[] args) {
        int height=4;
        int width=4;
        int space =width+height;
        int x=1;
        for(int i=0;i<=height;i++){
            for(int a=x;a<=width;a++){
               for(int j=space;j>=a;j--){
                System.out.print(" ");
               } 
               for(int k=1;k<a;k++){
                System.out.print(" *");
               }
               System.out.println();
            }
            x=x+2;
            width=width+2;
        }
        for(int i=1;i<=height-1;i++){
            for(int j=space-3;j>0;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=height-1;k++){
                System.out.print("  *");
            }
            System.out.println();
        }
    }
}
