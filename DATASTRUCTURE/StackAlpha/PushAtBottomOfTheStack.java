import java.util.Stack;
public class PushAtBottomOfTheStack {
    public static void pushAtBottom(Stack<Integer> s,int data){
   if(s.isEmpty()){
    s.push(data);
    return;
   }
        int top=s.pop();
    pushAtBottom(s,data);
    s.push(top);
   
    }
    public static void main(String[] args) {
      Stack<Integer> s=new Stack<>();
      for(int i=1;i<5-1;i++){
        s.push(i);
      }  
      pushAtBottom(s,4);
      while(!s.isEmpty()){
        System.out.println(s.peek());
        s.pop();
      }
    }
  
}
