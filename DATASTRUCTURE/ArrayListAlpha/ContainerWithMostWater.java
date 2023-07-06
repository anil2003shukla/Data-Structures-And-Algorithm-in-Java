import java.util.*;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
       System.out.println(storeWater(list)); 
       System.out.println(sotrewater(list));


    }
    //bruteforceapproach
    public static int storeWater(ArrayList<Integer>height){
        int maxwater=0;
        //brute force approach
        for(int i=0;i<height.size();i++){
            for(int j=i+1;j<height.size();j++){
                int ht=Math.min(height.get(i),height.get(j));
                int width=j-i;
                int curwater=ht*width;
                maxwater=Math.max(maxwater,curwater);
               
            }
        }
        return maxwater;
    } 
    public static int sotrewater(ArrayList<Integer> height){
                  int maxwater=0;
                  int lp=0;
                  int rp=height.size()-1;
                  while(lp<rp){
                    //calculate area of water
                    int ht=Math.min(height.get(lp),height.get(rp));
                    //updateptr
                    int wdth=rp-lp;
                    int currwater=ht*wdth;
                    maxwater=Math.max(maxwater,currwater);
                    if(height.get(lp)<height.get(rp)){
                        lp++;
                    }
                    else{
                        rp--;
                    }
                  }

           return maxwater;

    }
}
