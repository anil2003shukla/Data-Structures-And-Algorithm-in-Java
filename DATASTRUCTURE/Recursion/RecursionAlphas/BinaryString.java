public class BinaryString {
    public static void main(String[] args) {
        printStrings(15,0,"");
    
    }
    public static void printStrings(int n,int lastPlace,String str){
       /* if(lastPlace==0){
           
            printStrings(n-1,0, str.append("0"));
            printStrings(n-1,1,str.append("1"));
        }else{
            printStrings(n-1,0,str.append("0"));
        }*/ 
        //base case
        if(n==0){
        System.out.println(str);
        return;
        }
        //kaam
        printStrings(n-1,0,str+0);
        if(lastPlace==0){
            printStrings(n-1,1,str+1);
        }
        }
        
}
