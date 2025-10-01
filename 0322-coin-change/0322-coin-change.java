class Solution {
    public int coinChange(int[] coins, int amount) {

        /*
            - [13, 2, 1, 5, 9] coins
            - amount / target
            - return num of coins needed.. not what constitutes those coins

            - return minimum num of coins needed -- optimize our solution

            0 1 2 3 4 5 6 7 8 9 10 11
            0 1 1 2            

            Approach
            - create a 1D dp array from [0,n]
            - fill dp array with a large num or amount + 1
            - assign dp[0] to 0
            - traverse from 1 to n
            - at each element, i
                    - traverse the coins array
                    - if  coin[j] < i
                        - dp[i] is min between current dp[i] value or dp[current_index - coin_value] + 1
                        - in other words min between dp[i] and (dp[i - coins[j]] + 1)

            - end of traversal
            - return dp[amount]

            Edge Cases / Notes
            - coins be empty? no
            - amount range of input [0, 10^4]
            - negative coins or amount - no .. atleast 1
            - max/min length of coins - [1,12]

        */

        //Create and fill dp array
        int[] dp = new int[amount+1];
        Arrays.fill(dp, amount+1);
        dp[0] = 0;
        
        //Traversal
        for(int i = 1; i <= amount; i++){
            for(int j = 0; j < coins.length; j++){

                //Check of coin value <= i
                if(coins[j] <= i){
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                }
            }
        }

        if(dp[amount] == amount + 1){
            return -1;
        }

        return dp[amount];
    }
}