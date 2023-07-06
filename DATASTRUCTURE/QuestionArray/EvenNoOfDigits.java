public class EvenNoOfDigits{

    public static void main(String args[]){
 int[] nums={ 345,78,98768,679,89998,11,-3423};
 System.out.println(findnumber(nums));
    }
    static int findnumber(int[] nums){
        int count=0;
        for(int num:nums){
            if(even(num)){
                count++;
            }
            
        }
        return count;
    }
    // function to check whether number is even or no

    static boolean even(int num){
 int numofdigits=digits(num);
 if(numofdigits%2==0){
    return true;
 }
return false;
    }
    // count no of digits in a number
    static int digits(int num){
        if(num<0){
            num=num*-1;
        }
        int count=0;
        while(num>0){
            count++;
            num=num/10;
        }
        return count;
    }
}