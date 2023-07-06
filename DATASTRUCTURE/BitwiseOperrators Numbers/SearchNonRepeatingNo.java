public class SearchNonRepeatingNo {
    public static void main(String[] args) {
        int []arr={2,3,2,4,3,4,6};
       System.out.println(ans(arr));
    }

    public static int ans(int []arr){
        int unique=0;
        for(int num:arr){
            unique^=num;
        }
        return unique;
    } 
}
