public class BuyandSellStockPrice {
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
     System.out.println("max profit in stock="+buyAndSellStocks(prices));  
    }
   public static int buyAndSellStocks(int []prices){
     int buyPrice=Integer.MAX_VALUE;
     int maxprofit=0;
     for(int i=0;i<prices.length;i++){//profit
        if(buyPrice<prices[i]){
            int profit=prices[i]-buyPrice;//today's profit
            maxprofit=Math.max(maxprofit,profit);

        }
        else{
            buyPrice=prices[i];
        }
     }
     return maxprofit;
    }
}
