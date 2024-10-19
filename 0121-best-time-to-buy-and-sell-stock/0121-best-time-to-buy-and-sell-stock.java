class Solution {
    public int maxProfit(int[] prices) {
        /*
            - Two pointers
            - Left points to the days we buy (lower)
            - Right goes and counts profits
        */
        
        int min = prices[0];
        int maxProfit = 0;
        int profit = 0;

        int l = 0;
        int r = 1;

        while(r < prices.length){
            
            if(prices[r] < min){
                min = prices[r];
                l = r;
            } else {
                profit = prices[r] - min;
                maxProfit = Math.max(profit, maxProfit);
            }

            r++;
        }

        return maxProfit;
    }
}