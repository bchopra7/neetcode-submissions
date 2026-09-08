class Solution {
    public int maxProfit(int[] prices) {
        
        //https://www.youtube.com/watch?v=E2-heUEnZKU
        int buyPrice = prices[0];
        int profit = 0;
      

      for(int i=0; i<prices.length; i++){
        
        if(buyPrice > prices[i]){
            buyPrice = prices[i];
        }

        else{
            int currProfit = prices[i] - buyPrice;
            profit = Math.max(currProfit,profit);
        }
      }
      return profit;  
    }
}
