public class ASCIIVALUEOFcharacter {
    public static void main(String[] args) {
        subseqAsccii(" ","abd");
    }
    static void subseqAsccii(String p,String up )
{
      if(up.isEmpty()){
        System.out.println((p));
        return;
      }
      char ch=up.charAt(0);
      subseqAsccii(p+ch,up.substring(1));
      subseqAsccii(p,up.substring(1));
      subseqAsccii(p+(ch+0),up.substring(1));
      
}
}
