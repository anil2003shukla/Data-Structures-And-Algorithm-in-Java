public class PainringNoOfFriend {
    public static void main(String[] args) {
      System.out.println( friendsPairing(3)); 
    }
    public static int friendsPairing(int n){
     if(n==1||n==2){
        return n;
     }
        //choicew 
    //single
    int single=friendsPairing(n-1);
    //pair
    int pairs=friendsPairing(n-2);
    int pairways=(n-1)*pairs;
    //total no of ways
    int totalways=single+pairways;
    return totalways;
    }
   

}
