import java.util.*;
public class QqueriesCheckWhetherNoPresentOrNot {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter no of element in the array");
        int n=scan.nextInt();
        int arr[]=new int[n];
        System.out.println("Pleaase Enter the  "+ n+ "elements in the array");
        for(int i=0;i<n;i++){
         arr[i]=scan.nextInt();
        }
        int []freq=makeFrequencyArray(arr);
        System.out.println("Please Enter no of  queries");
        int q=scan.nextInt();
        while(q>0){
            System.out.println("Enter number to be searched");
            int x=scan.nextInt();
           if(freq[x]>0){
            System.out.println("Yes");
           }
           else{
            System.out.println("No");
           }
            q--;
        }
    }
    static int [] makeFrequencyArray(int []arr){
    int [] freq=new int[100005];
    for(int i=0;i<arr.length;i++){
        freq[arr[i]]++;
    }
    return freq;
}

}
