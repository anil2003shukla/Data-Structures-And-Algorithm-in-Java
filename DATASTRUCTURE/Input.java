import java.util.*;
public class Input {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int [] arr=new int[5];
        //this following arrays is primitive
        arr[0]=2;
        arr[1]=3;
        arr[2]=4;
        arr[4]=45;
        //[45,45,67,67,543]
        System.out.println(arr[3]);
        //input using for loop
      //  System.out.println("enter the elements in arrays");
       // for(int i=0;i<arr.length;i++){
        //    arr[i]=scan.nextInt();

       // }
       // System.out.println("output of the arrays");
       // for(int i=0;i<arr.length;i++){
          //  System.out.println(arr[i]);
       // }
       // for(int num:arr){ //for every element in an arrrrays, print the element
         //   System.out.println(num);// here num represent element of the array
         //   System.out.println(arr[5]);//array out of boound

      //  }
      //arrAYS OBJECTS
     
        System.out.println(Arrays.toString(arr));
        System.out.println("pleASE ENTER THE String");
        String[] str=new String[4];
        for(int i=0;i<str.length;i++){
            str[i]=scan.next();
        }
        System.out.println(Arrays.toString(str));
        str[2]="aniil";
        System.out.println(Arrays.toString(str));
    }
}
