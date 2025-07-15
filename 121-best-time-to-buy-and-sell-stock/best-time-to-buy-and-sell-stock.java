class Solution {
    public int maxProfit(int[] prices) {
        
        int buyPrice = Integer.MAX_VALUE, maxProfit=0;
        for(int i=0; i<prices.length-1; i++){
            if(prices[i] < buyPrice){
                buyPrice = prices[i];
            }
            int currentProfit = prices[i+1] - buyPrice;

            if(currentProfit>maxProfit){
                maxProfit = currentProfit;
            }
        }
        return maxProfit;
    }
}