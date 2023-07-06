import java.util.*;
public class DuplicateParentheses {
    public static boolean isDuplicateParanthses(String str1){
    Stack<Character> s=new Stack();
    for(int i=0;i<str1.length();i++){
        char ch=str1.charAt(i);
       if(ch==')'){
        int count =0;
        while(s.peek()!='('){
            s.pop();
            count++;
        }
        if(count<1){
            return true;//duplicate

        }
        else{
            s.pop();//opening pair
        }
       }
       else{
      s.push(ch);
       }
    }
    return false;
    }
    public static void main(String[] args) {
        String str1="((a+b))";
        System.out.println(isDuplicateParanthses(str1));
    }
}
