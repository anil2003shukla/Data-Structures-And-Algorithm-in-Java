import java.util.LinkedList;
public class CllectionJavaFrameWork {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(0);
        list.add(1);
        list.add(2);
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
    }
}
