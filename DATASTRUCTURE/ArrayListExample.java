 
import java.util.ArrayList;
import java.util.*;
public class ArrayListExample {
    public static void main(String args[]){
ArrayList<Integer> list=new ArrayList<>();
//list.add(45);
//list.add(47);
 //boolean s=list.contains(45);
 
///System.out.println(s);
//System.out.println(list);
//list.set(1,678);
//System.out.println(list);
Scanner scan=new Scanner(System.in);
for(int i=0;i<=4;i++){
    list.add(scan.nextInt());
}
for(int i=0;i<=4;i++){
    System.out.println(list.get(i));//pass index here list[index will not work]
}
System.out.println(list);
    }
}
