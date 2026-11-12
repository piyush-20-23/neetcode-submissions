class Solution {
    public int maxProfit(int[] prices) {

        int currMax = prices[prices.length - 1];
        int profit = 0;
        
        for(int i = prices.length - 1; i >= 0; i --){
            currMax = Math.max(currMax, prices[i]);

            profit = Math.max(profit, currMax - prices[i]);

        }

        return profit;
    }
}
