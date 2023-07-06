public class DiagonalTraversal {
    public static void main(String[] args) {
        int arr[][]={
            {11,12,13,14,15,16},
            {21,22,23,24,25,26},
            {31,32,33,34,35,36},
            {41,42,43,44,45,46},
            {51,52,53,54,55,56},
            {61,62,63,64,65,66}
    };
    for(int g=0;g<arr.length;g++){
        for(int i= 0,j=g;j<arr.length;i++,j++){
            System.out.print(arr[i][j]+" ");

        }
    }
    }
}
