public class DiceThrow {
    public static void main(String[] args) {
        Dices("",4);
    }
    static void Dices(String p, int target){
        if(target==0){
            System.out.println(p);
            return;
        }
        for(int i=1;i<=6&&i<=target;i++){
            Dices(p+i,target-i);
        }
    }
}
