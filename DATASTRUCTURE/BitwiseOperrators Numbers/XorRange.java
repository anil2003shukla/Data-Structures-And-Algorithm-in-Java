public class XorRange{
public static void main(String[] args) {
    // range xor for a,b=xor(b)^xor(a-1)
    int a=3;
    int b=9;
    int ans2=0;
    int ans=xor(b)^xor(a-1);
    System.out.println(ans);
    // only use for check ,wil give TLE for large number;
    for(int i=a;i<=b;i++){
        ans2 ^=i;
    } 
    System.out.println(ans); 
}
// this gives from 0 to a

static int xor(int a ){
    if(a%4==0){
        return 4;

    }
    if(a%4==1){
        return 1;
    }
    if(a%4==2){
        return a+1;
    }
    return  0;

}
}