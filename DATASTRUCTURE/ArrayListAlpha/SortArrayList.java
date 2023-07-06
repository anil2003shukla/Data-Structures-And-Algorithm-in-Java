import java.util.ArrayList;
import java.util.Collections;
public class SortArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(8);
        list.add(0);
        list.add(98);
        Collections.sort(list);
        System.out.println(list);
        //descending order sort list
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
}
