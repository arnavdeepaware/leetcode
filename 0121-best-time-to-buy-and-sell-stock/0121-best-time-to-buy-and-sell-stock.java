class Solution {
    public int maxProfit(int[] prices) {
        
        int max = 0;
        int left = prices[0];

        for(int i = 1; i < prices.length; i++){
            int sale = prices[i] - left;

            if(sale < 0){
                left = prices[i];
            }else{
                max = Math.max(max, sale);
            }
        }

        return max;
    }
}