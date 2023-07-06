public class HeartPatern {
    public static void main(String[] args) {
        int row,col;
        for(row=0;row<=3;row++){
            for(col=0;col<=17;col++){
                if((col>3-row&&col<=6+row)||(col>=12-row&&col<=15+row)){
                    System.out.print(" *");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for(row=0;row<9;row++){
            for(col=0;col<=17;col++){
                if(col>row+1&&col<=17-row){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
            }
            System.out.println();
        }
    }
}
