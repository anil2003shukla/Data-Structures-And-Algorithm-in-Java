public class FindSmallestLetterGreaterThanTarget {
    public static void main(String args[]){
        char [] letters={'c','d','e','f'};
        char target='g';
        char result=nextcharacterller(letters,target);
        System.out.println("nextgreater character in given character array="+result);
    }
    static char nextcharacterller(char []letters,char target){
        int start=0;
         int end=letters.length-1;
         while(start<=end){
            int mid=start+(end-start);
            if(target>letters[mid]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }

         }
         return letters[start%letters.length];
    }
}
