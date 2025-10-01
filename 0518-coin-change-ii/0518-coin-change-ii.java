class Solution {
    public int change(int amount, int[] coins) {


        /*
            : 
            5 = 5
            5 = 2 + 2 + 1
            5 = 2 + 1 + 1 + 1
            5 = 1 + 1 + 1 + 1 + 1

            dp where we store for each num from 0 to n, how many possible combinations we have

                [0,1,2,3,4,5]
              1  1,1,2,2,3,4
              2  1,0,1,0,1,1
              5  1,0,0,0,0,1

              dp[r][c] = dp[r-1][c] + dp[r][amount-c];
              if amount -c < 0: dp[r-1][c]
              if r-1 >= n: dp[r][amount-c]
              if both edge cases true: 0

              - Create a dp array for size [coins.len][amount+1]
              - sort coins
              - assign n=0 for all coins to be 0
              - traverse the 2d dp array: reverse rows, straigh cols
              - at each iteration, check for edge cases
              - handle edge cases
              - if normal case: assign dp[r-1][c] + dp[r][amount-c];
              - return dp[0][n] after traversal
        */

        int n = coins.length;

        int[][] dp = new int[n+1][amount + 1];
        Arrays.sort(coins);

        for(int i = 0; i <= n; i++){
            dp[i][0] = 1;
        }

        for(int i = n-1; i >= 0; i--){
            for(int a = 1; a <= amount; a++){
                if(a >= coins[i]){
                    dp[i][a] = dp[i+1][a] + dp[i][a - coins[i]];
                }
            }
        }

        return dp[0][amount];
        
    }
}