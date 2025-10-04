class Solution {
    public int climbStairs(int n) {
        
        /*
            - [1,2,3,5,8,13,21]

            base case: n = 1: 1
                       n = 2: 2

        */

        //Edge Case
        if(n < 3) return n;

        //DP Array to store steps at each level/iteration
        int[] dp = new int[n];
        dp[0] = 1;
        dp[1] = 2;

        for(int i = 2; i < n; i++){
            dp[i] = dp[i-2] + dp[i-1];
        }

        return dp[n-1];
    }
}