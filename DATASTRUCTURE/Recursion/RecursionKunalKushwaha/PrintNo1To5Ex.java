public class PrintNo1To5Ex{
    public static void main(String[] args) {
        print1(1);
    }
    //recursive function
    static void print1(int n){
      if(n==5){
        return;
   }
    System.out.println(n);
    // THIS IS THE TAIL RECURSION
        print1(n+1);
        print2(2);
        
    }
    //recursive call
    //if you are calling a function again and again ,you can treat it as a separate call in stack 
    static void print2(int n){
        System.out.println(n);
        print3(3);
    }
    static void print3(int n){
    
        System.out.println(n);
       print4(4 );
    }
    static void print4(int n){
        System.out.println(n);
         print5(5);
    }
    static void print5(int n){
        System.out.println(n);
    }
}