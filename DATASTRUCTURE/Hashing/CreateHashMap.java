
import java.util.HashMap;
public class CreateHashMap{
    public static void main(String[] args) {
        //create hashmap
        HashMap<String,Integer> hm = new HashMap<>();
          //Insert
          hm.put("India",100);
          hm.put("China",150); 
          hm.put("US",50);
          hm.put("Indonosia",1);
         System.out.print(hm+" ");
         //GEt-O(1)
       int population=  hm.get("India");
       System.out.println(population+" ");
       System.out.println(hm.get("us"));  
       //contains key
       System.out.println(hm.containsKey("India")); 
       System.out.println(hm.containsKey("Indias")); 
       //remove
      System.out.println(hm.remove("US")); 
       System.out.println(hm);            
    }
}