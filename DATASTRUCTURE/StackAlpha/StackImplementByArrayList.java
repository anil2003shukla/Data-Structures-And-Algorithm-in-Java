import java.util.ArrayList;
public class StackImplementByArrayList{
    static class Stack{
        static ArrayList<Integer> list=new ArrayList<>();
        public static boolean isempty(){
            return list.size()==0;
        }
    //push
    public static void push(int data){
        list.add(data);
    }
    //pop
    public static int pop(){
        if(isempty()){
            return -1;
        }
        int top=list.get(list.size()-1);
        list.remove(list.size()-1);
        return top;
    }
    //peek
    public static int peek(){
        if(isempty()){
            return -1;
        }
        return list.get(list.size()-1);
    }
    }
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(78);
        s.push(77);
        s.push(76);
        s.push(75);
        s.push(74);
        s.push(73);
        s.push(72);
        s.push(71);
        s.push(70);
        while(!s.isempty()) {
            System.out.println(s.peek());
            s.pop();
           
        }
    }
}