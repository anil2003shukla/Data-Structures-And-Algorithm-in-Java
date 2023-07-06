import java.util.*;

public class PassingFunctions {
    public static void main(String args[]){
int [] nums={5,5,6,7};
System.out.println(Arrays.toString(nums));
change(nums);
System.out.println(Arrays.toString(nums));
    }
    static void change(int[] arr){
        arr[0]=99;
    }
}
