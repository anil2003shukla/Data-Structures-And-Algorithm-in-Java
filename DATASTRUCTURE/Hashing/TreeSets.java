import java.util.*;
public class TreeSets {
    public static void main(String[] args) {
        LinkedHashSet<String> cities=new LinkedHashSet(); 
        cities.add("delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bengaluru");
        System.out.println(cities);
        HashSet<Integer> hs=new HashSet<>();
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);
        hs.add(5);
        hs.add(6);
        hs.add(7);
        System.out.println(hs);
       TreeSet<String> citiess=new TreeSet<>();
       citiess.add("Delhi");
        citiess.add("Mumbai");
        citiess.add("Noida");
        citiess.add("Bengaluru");
        citiess.add("Bengaluru");
        System.out.println(citiess);
    }
}
