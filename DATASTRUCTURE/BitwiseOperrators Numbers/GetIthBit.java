import java.net.SocketTimeoutException;

public class GetIthBit {
    public static void main(String[] args) {
       
        System.out.println(getIthit(10,3));
        System.out.println( SetIthBit(10,2));
        System.out.println( ClearIthBit(10,2));
        System.out.println(  UpdateIthBite(10,2,9));
    }
    public static int getIthit(int n,int i){
       int bitmask=(1<<i);
        if((n &bitmask)==0){
           return 0;
        }
        else{

       
        return 1;
    }
    }
    public static int SetIthBit(int n,int i){
        int bitmask=1<<i;
        return n|bitmask;

    } 
    public static int ClearIthBit(int n,int i){
        int bitmask=~(1<<i);
        return n&bitmask;
    }
            public static int   UpdateIthBite(int n, int i,int newbit){
                if(newbit==0){
                    return ClearIthBit(n, i);
                }
                else{
                    return SetIthBit(n, newbit);
                }
            }
}
