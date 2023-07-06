import java.util.*;
public class FctorsOfTheNumber {
    public static void main(String[] args) {
        factors(20); 
        factors2(20);
        factors3(46);
       }
        //o(n)
    static void factors(int n){
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.println(i+" ");
            }
        }

    }
    //o(sqrt(n))
    static  void factors2(int n){
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                if(n/i==i){
                    System.out.print(i+" ");
                }
                else{
                    System.out.print(i  +  " " +  n/i + " ");
                }

            
           
            }
        }

    }// both time and space with be sqrt(n);
    static void factors3(int n){
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                if(n/i==i){
                    System.out.print(i+" ");
                }
                else{
                    System.out.print(i  +  " " );
                    list.add(n/i);
                }

            
           
            }
        } 
        for(int i=list.size()-1;i>=0;i--){
            System.out.println(list.get(i)+" ");
        }
    }
}
