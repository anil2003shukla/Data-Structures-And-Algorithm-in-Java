public class MaxWealth {
    public static void main(String args[]){
int [][]accounts={ 
    { 2,3,4,5},{45,76,78,},{45,76,45,32},{45,8}

};
System.out.println(maximuimWealth(accounts));
    }
    //person =row
    //account=col
    static int maximuimWealth(int[][] accounts){
        //when you start a new column ,take new sum for that row
        int ans=Integer.MIN_VALUE;
        for(int person=0;person<accounts.length;person++){
            int rowsum=0;
            for(int account=0 ;account<accounts[person].length;account++){
              rowsum=rowsum+accounts[person][account];  
              //now we have sum of accounts of person 
        //check whether 
                     }
                     if(rowsum>ans){
                        ans=rowsum;
                     }
        }
        return ans;
        
    }
}
