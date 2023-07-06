import java.util.*;
public class PairSum1 {
    public static void main(String[] args) {
       ArrayList<Integer> list=new ArrayList<>();
       list.add(1);
       list.add(2);
       list.add(3);
       list.add(4);
       list.add(5);
       list.add(6);
       list.add(7);
       list.add(8);
       int target=0;
       target=4;
     System.out.println(pairsum(list,target));
    System.out.println(paisum1(list,target));      }
    public static boolean pairsum(ArrayList<Integer> list,int target){
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i)+list.get(j)==target){
                    return true;
                }
            }
        }
      return false;
    }
    public static boolean paisum1(ArrayList<Integer> list, int target){
        int lp=0;
        int rp=list.size()-1;
        while(lp<rp){
            //case1
            if(list.get(lp)+list.get(rp)==target){
                return true;
            }
            if(list.get(lp)+list.get(rp)<target){
                lp++;
            }
            else{
                rp--;
            }
        }
        return false;
    }
}
