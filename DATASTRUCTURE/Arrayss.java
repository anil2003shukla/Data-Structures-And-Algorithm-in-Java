public class Arrayss{
    public  static void main( String args[]) {
        // Q: store a roll number
        String name=" anil kumar shukla";
        int roll1=1;
        int roll2=2;
        int roll3=3;
        int roll4=4;
        //syntax
        //datatype[] variable_name=new datatype[size];
        //sotre 5 roll no;
       int[] rollno=new int[5];
        //or directly
        int [] rollno2={2,3,4,5,6};
        int[ ]ros;//declaration of array .ros is getting defined in the stack
        ros=new int[5];//initialization: actually here object created in the memory 
        String [] arr=new String[7];
        
        System.out.println(name);
        System.out.println(roll1);
        System.out.println(roll2);
        System.out.println(roll3);
        System.out.println(roll4);
        System.out.println(ros[1]);
        System.out.println(rollno2[3]);

        System.out.println(arr[2]);
        System.out.println(ros[1]);
    }
}