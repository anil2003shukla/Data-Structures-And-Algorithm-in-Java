import java.util.*;
public class FindItineraryFromToTicket {
    public static String getStart(HashMap<String,String> tickets){
        HashMap<String,String> revMap =new HashMap<>(); 
        for(String key:tickets.keySet()){
            revMap.put(tickets.get(key),key);
        }
        for(String key:tickets.keySet()){
            if(!revMap.containsKey(key)){
                return key;//stATING POINT

            }
        }
        return null;
    } 
    public static void main(String[] args) {
        HashMap<String,String> tickets=new HashMap<>();
        tickets.put("chennai","Bengaluru");
        tickets.put("Mumbai","Delhi");
        tickets.put("Goa","chennai");
        tickets.put("Delhi","Goa");
        String start=getStart(tickets);
        System.out.print(start);
        for(String key:tickets.keySet()){
        System.out.print("->"+tickets.get(start));
        start=tickets.get(start);
        }
        System.out.println();
    }
}
