import java.util.*;
public class HashSets {
    public static void main(String[] args) {
        HashSet<Integer> hs=new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);
        hs.add(5);
        hs.add(6);
        hs.add(7);
        System.out.println(hs);
        hs.remove(2);
        if(hs.contains(2)){
            System.out.println("set contains 2");
        }
        hs.clear();
        System.out.println(hs.size());
        System.out.println(hs.isEmpty());
    }
}
