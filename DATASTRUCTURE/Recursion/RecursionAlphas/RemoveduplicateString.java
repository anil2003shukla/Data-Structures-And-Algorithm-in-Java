import javax.sound.sampled.SourceDataLine;

public class RemoveduplicateString {
    public static void main(String[] args) {
         String str="aanillkd";
        remove(str,0,new StringBuilder(""),new boolean[26]);
    }
    public static void remove(String  str,int idx,StringBuilder newStr,boolean map[]){
        if(idx==str.length()){
            System.out.println(newStr);
            return ;
        }
        //kaam
        char currentchar=str.charAt(idx);
        if(map[currentchar-'a']==true){
            remove(str,idx+1,newStr,map);

        }
        else{
            map[currentchar-'a']=true;
            remove(str,idx+1,newStr.append(currentchar),map);
        }
    }
}
