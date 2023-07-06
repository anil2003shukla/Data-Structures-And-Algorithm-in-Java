 import java.net.SocketTimeoutException;
import java.util.ArrayList;
 public class DemoArrayList{
    public static void main(String[] args) {
        //clasNme object =new className();
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<String> list2=new ArrayList<>();
        ArrayList<Boolean> list3=new ArrayList<>();
       // add method
        list.add(20);
        list.add(21);
        list.add(45);
        list.add(22);
        list.add(24);
        list.add(25);
        list.add(26);
        list.add(27);
        list.add(28);

        list2.add("String ji kaise ho ");
       System.out.println(list);
       System.out.println(list2);
       // operation get
       int element=list.get(4);
       System.out.println(element);
       //remove method
       list.remove(5);//o(n)
       System.out.println(list);
       //set element at index
       list.set(2,89);//O(n)
       System.out.println(list);
       //contains element
       System.out.println(list.contains(22));
       System.out.println(list.contains(123));
          //size method
          System.out.println(list.size());  
          for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
          }   
          System.out.println();
    
    }

 }