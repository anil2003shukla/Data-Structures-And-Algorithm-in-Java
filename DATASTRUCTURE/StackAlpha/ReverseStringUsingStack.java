import java.util.Stack;
public class ReverseStringUsingStack {
   public static String reverseString(String str){
    Stack<Character> s=new Stack();
   
    int i=0;
    while(i<str.length()){
        s.push(str.charAt(i));
            i++;
        
    }
    StringBuilder  result=new StringBuilder("");
    while(!s.isEmpty()){
        char curr=s.pop();
        result.append(curr);

    }
    str=result.toString();
    return str;
   }
    public static void main(String[] args) {
    String str="abc asdf";
    String result=reverseString(str);
    System.out.println(result);
   } 
}
