class Solution {
    public int maxProfit(int[] prices) {

        /*
            - int[] is input
            - non negative numbers
            - need to find max total profit possible
            - we can sell and buy multiple times and cumlate the profit
            - We can only have one share at a time
            - We need to sell before we can buy again
            - We buy at lows and sell at highs
            - We need to buy right after the high and repeat
            - Return total profit

            - Need a pointer for buying price
            - Need to store current max
            - need to store profit until we sell
                - Calculate profit by max - buy prices
            - add profit to total profit when we sell
            - reset profit after selling
        */

        int buy = prices[0];
        int max = buy;
        // int profit = 0;
        int totalProfit = 0;

        for(int i = 1; i < prices.length; i++){

            //Sell and then buy
            if(prices[i] < max){
                totalProfit += prices[i-1] - buy;
                buy = prices[i];
                max = buy;
            } else {
                max = prices[i];
            }
        }

        totalProfit += max - buy;

        return totalProfit;
        
    }
}