import java.net.SocketTimeoutException;
import java.util.ArrayList;
public class MultiDimensionArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainlist=new ArrayList<>();
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        ArrayList<Integer> list3=new ArrayList<>();
        for(int i=1;i<=5;i++){
            list.add(i*1);
            list2.add(i*2);
            list3.add(i*3);
           
        }
        mainlist.add(list);
        mainlist.add(list2);
        mainlist.add(list3);
       /*  list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        
       
       
        list2.add(2);
        list2.add(4);
        list2.add(6);
        list2.add(8);
        list2.add(10);
       
       
        list3.add(3);
        list3.add(6);
        list3.add(9);
        list3.add(12);
        list3.add(15);*/
        
        for(int i=0;i<mainlist.size();i++){
            ArrayList<Integer> curList=mainlist.get(i);
            for(int j=0;j<curList.size();j++){
                System.out.print(curList.get(j)+" ");
            }
            System.out.println();
        }
        System.out.println(mainlist);
    }
}
