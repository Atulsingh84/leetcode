class Solution {
    public int maxProfit(int[] prices) {
        
        if (prices == null || prices.length == 0) {
            return 0;
        }
        
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        
        for (int i = 0; i < prices.length; i++) {
            // Update the minimum price seen so far
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
            // Calculate profit if we sell today and update maxProfit
            else if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }
        
        return maxProfit;
    }
}
    