import java.util.*;
public class MajorityElement {
  public static void main(String[] args) {
    int arr[]={1,3,5,5,1,3,1,5,5};
    HashMap<Integer,Integer> map=new HashMap<>();
    for(int i=0;i<arr.length;i++){
      //  if(map.containsKey(arr[i])){
      //  map.put(arr[i],map.get(arr[i])+1);
  //  }
  //  else{
 //      map.put(arr[i],1);
 //   }
    map.put(arr[i],map.getOrDefault(arr[i],0)+1);
}
  // Set<Integer> keySet=map.keySet();
   for(Integer keys:map.keySet()){
   //   for(Integer keys:keySet){
      if(map.get(keys)>arr.length/3){
        System.out.print(keys);
      }
        System.out.println();
      }
}  
}
