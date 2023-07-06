import java.util.ArrayList;
import java.util.*;
public class Mutial {
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> list =new ArrayList<>();
//initalisation
Scanner scan=new Scanner(System.in);
for(int i=0;i<3;i++){
    list.add(new ArrayList<>());
}
//add
for(int i=0;i<3;i++){
    for(int j=0;j<3;j++){
        list.get(i).add(scan.nextInt());
    }
}
System.out.println(list);
    }
}
