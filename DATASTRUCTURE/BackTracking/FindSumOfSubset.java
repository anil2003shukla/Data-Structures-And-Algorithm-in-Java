public class FindSumOfSubset {
      public static void findSumOFsubset(int i,String ans,String str){
        //base case
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("null");
            }
               System.out.println(ans);
               return;
        }
        //yes choices
        findSumOFsubset(i+1,ans+str.charAt(i),str);
        //No choice
        findSumOFsubset(i+1,ans,str);
      }
      public static void main(String[] args) {
        String str="abc";
        findSumOFsubset(0,"",str);
      }

      
}
