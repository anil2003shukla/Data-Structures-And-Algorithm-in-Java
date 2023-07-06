import java.util.*;
public class ReverseArraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(98);
        Scanner scan=new Scanner(System.in);
        ArrayList<Integer> lit2=new ArrayList<>();
        System.out.println("Enter eleemnt in the arraylist");
           int n=scan.nextInt();
        for(int i=0;i<n;i++){
            list.add(scan.nextInt());
        }
        System.out.println("print original list");
        System.out.println(list);
        System.out.println("reverse arraylist");
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    
    for(int i=n-1;i>=0;i--){
        lit2.add(list.get(i));
    }
    System.out.println(lit2);
}
}
