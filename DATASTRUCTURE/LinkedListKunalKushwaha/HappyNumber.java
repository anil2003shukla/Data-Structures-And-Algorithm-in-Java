public class HappyNumber {
    
    public static boolean ishappy(int n){
        int slow=n;
        int fast=n;
        do{
      slow=findSquare(slow);
      fast=findSquare(findSquare(fast));
        }while(slow !=fast);
        if(slow==1){
            return true;
        }
        return false;
    }
    private static  int findSquare(int number){
        int ans=0;
        while(number>0){
int rem=number%10;
ans +=rem*rem;
number=number/10;
        }
        return ans;
    }
        public static void main(String[] args) {
        System.out.println(ishappy(19));   
    
    
        
    }
}
