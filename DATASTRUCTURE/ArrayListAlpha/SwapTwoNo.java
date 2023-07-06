import java.util.*;
public class SwapTwoNo {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        System.out.println("Enter no of element ");
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for(int i=0;i<n;i++){
            list.add(scan.nextInt());
        }
        int idx1=1,idx2=3;
        swap(list,idx1,idx2);
        System.out.println(list);
       
    }
    public static void swap(ArrayList<Integer> list,int idx1,int idx2){
        int temp=list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
        
        
        
    }
}
