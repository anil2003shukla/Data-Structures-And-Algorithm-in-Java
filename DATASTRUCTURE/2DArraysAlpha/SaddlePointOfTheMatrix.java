public class SaddlePointOfTheMatrix {
    public static void main(String[] args) {
        int arr[][]={
            {11,12,13,14,15},
            {21,22,23,24,25},
            {31,32,33,34,35},
            {41,42,43,44,45},
            {61,62,63,64,65}
        };
        int svj=0;
        for(int i=0;i<arr.length;i++){
           
            for(int j=0;j<arr.length;j++){
                if(arr[i][j]<arr[i][svj]){
                    svj=j;
                }
            }
            boolean flag=true;
            for(int k=0;k<arr.length;k++){
                if(arr[k][svj]>arr[i][svj]){
                    flag=false;
                    break;
                }

            }
            if(flag==true){
                System.out.println(arr[i][svj]);
                return;
            }
        }
        System.out.println("invalid input");
    }
}
