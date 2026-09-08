class Solution {
    public int maxProfit(int[] prices) {
        
        int maxProfit = 0;
        int buyPrice = prices[0];

        for(int i=0; i<prices.length; i++){
             
            if(buyPrice > prices[i]){
                buyPrice = prices[i];
            }

            int currProfit  = prices[i]-buyPrice;
            maxProfit = Math.max(currProfit,maxProfit);
        }
        return maxProfit;
    }

}
