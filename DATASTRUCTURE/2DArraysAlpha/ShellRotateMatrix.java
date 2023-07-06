import java.util.*;
public class ShellRotateMatrix {
    public static void main(String[] args) {
        int arr[][]={
                {11,12,13,14,15,16},
                {21,22,23,24,25,26},
                {31,32,33,34,35,36},
                {41,42,43,44,45,46},
                {51,52,53,54,55,56},
                {61,62,63,64,65,66}
        };
       Scanner scn=new Scanner(System.in);
       System.out.println("Enter the value of Shell 's' and  no of rotation 'r'");
       int s=scn.nextInt();
       int r=scn.nextInt();
        rotateShell(arr,s,r);
        display(arr);
    }
    public static void rotateShell(int arr[][],int s,int r){
            int oned[]=filoneDFromShell(arr,s);
            rotate(oned,r);
            filShellFromoned(arr,s,oned);
    }
    public static int [] filoneDFromShell(int [][]arr,int s){
                int minr=s-1;
                int minc=s-1;
                int maxr=arr.length-s;
                int maxc=arr[0].length-s;
                //size=leftwall+bottomwall+rightwall+topwall-4;
                //rightwall+topwall=2lw+2bw-4;
                //lw=maxr-minr+1
                //bw=maxc-minc+1;
                 int size=2*(maxr-minr+1)+2*(maxc-minc+1)-4;
                 int oned[]=new int[size];
                 //lw
                 int idx=0;
                 for(int i=minr,j=minc;i<=maxr;i++){
                    oned [idx]=arr[i][j];
                    idx++;
                 }
                 //bw
                 for(int  i=maxr,j=minc+1;j<=maxc;j++){
                    oned [idx]=arr[i][j];
                    idx++;
                 }
                 //rightwall
                 for(int  i=maxr-1,j=maxc;i>=minr;i--){
                    oned [idx]=arr[i][j];
                    idx++;
                 }
                 //tw
                 for(int  i=minr,j=maxc-1;j>=minr+1;j--){
                    oned [idx]=arr[i][j];
                    idx++;
                 }
                 return oned;
    }
    public static void filShellFromoned(int [][]arr,int s,int[]oned){
        int minr=s-1;
        int minc=s-1;
        int maxr=arr.length-s;
        int maxc=arr[0].length-s;
        int idx=0;
        //lw
        for(int i=minr,j=minc;i<=maxr;i++){
            arr[i][j]=oned[idx];
            idx++;
        }
        //bw
        for(int i=maxr,j=minc+1;j<=maxc;j++){
            arr[i][j]=oned[idx];
            idx++;

        }
        //rightwall
        for(int i=maxr-1,j=maxc;i>=minr;i--){
            arr[i][j]=oned[idx];
            idx++;
        }
        for(int  i=minr,j=maxc-1;j>=minr+1;j--){
            oned [idx]=arr[i][j];
            idx++;
         }

    }
    public static void rotate(int []oned,int r){
        r= r % oned.length;
        if(r<0){
            r=r+oned.length;
        }
        reverse(oned,0,oned.length-1-r);
        reverse(oned,oned.length-r,oned.length-1);
        reverse(oned,0,oned.length-1);
    }
    public static void  reverse(int []oned,int li,int ri){
         while(li<ri){
            int temp=oned[li];
            oned[li]=oned[ri];
            oned[ri]=temp;
            li++;
            ri--;
         }
        
    }
    public static void display(int [][]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
        }
    }
}
