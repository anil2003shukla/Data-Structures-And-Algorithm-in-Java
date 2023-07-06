import java.util.*;
public class LetterCombinationOfPhonePaid {
    public static void main(String[] args) {
        pad("","125");
        System.out.println(padret("","12"));
        System.out.println(padcount("","456"));
    }
    static void pad(String p,String up) {
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit=up.charAt(0)-'0';//this will convert '2'into 2
        for(int i=(digit-1)*3;i<digit*3;i++){
            char chs=(char)('a'+i);
            pad(p+chs,up.substring(1));
        }
    }
    static  ArrayList<String>  padret(String p,String up) {
        if(up.isEmpty()){
           ArrayList<String> list=new ArrayList<>();
           list.add(p);
           return list;
        }
        int digit=up.charAt(0)-'0';//this will convert '2'into 2
    ArrayList<String> list=new ArrayList<>();
        for(int i=(digit-1)*3;i<digit*3;i++){
            char chs=(char)('a'+i);
         list.addAll(padret(p+chs,up.substring(1)));
        }
        return list;
    }
    static int padcount(String p,String up) {
        if(up.isEmpty()){
           
            return 1;
        }
        int count=0;
        int digit=up.charAt(0)-'0';//this will convert '2'into 2
        for(int i=(digit-1)*3;i<digit*3;i++){
            char chs=(char)('a'+i);
         count=count+ padcount(p+chs,up.substring(1));
        }
        return count;
    }
}
