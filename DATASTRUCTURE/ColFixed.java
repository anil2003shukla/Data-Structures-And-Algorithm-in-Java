public class ColFixed {
    public static void main(String args[]){
        int[][]arr={
            { 1,3,2,6},
            {3,5},
            {3,4,5}

        };
        for(int r=0;r<arr.length;r++){
            for(int c=0;c<arr[r].length;c++){
                System.out.print(arr[r][c]+" ");
            }
            System.out.println();
        }
    }
}
