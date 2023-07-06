import java.util.Stack;
public class StackImplementByCollectionFrameWork {
 public static void main(String[] args) {
    Stack<String> stack=new Stack<>();
    stack.push("anil");
    stack.push("kumar");
    stack.push("shukla");
    while(!stack.isEmpty()){
          System.out.println(stack.peek());
          stack.pop();
    }
 }
}
