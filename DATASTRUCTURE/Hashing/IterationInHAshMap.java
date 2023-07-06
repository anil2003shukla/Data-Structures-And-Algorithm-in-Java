import java.util.*;
public class IterationInHAshMap {
    public static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap();
        hm.put("India",100);
        hm.put("USA",200);
        hm.put(" China",101);
        hm.put("America",30);
        //Iterate
        //Entry set hm.entrySet()
        Set<String> s=hm.keySet();
        System.out.print(s);
        for (String k : s) {
           System.out.println("Keys="+k+","+"value="+hm.get(k)); 
        }

    }
}
