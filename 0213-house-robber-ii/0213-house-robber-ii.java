class Solution {
    public int rob(int[] nums) {

        /*
            Implement house robber but we can either choose house 1 to n-1
            or
            house 2 to n

            use a helper function to implement house robber
            return max between two routes
        */

        int n = nums.length;

        //Edge Case
        if(n == 1) return nums[0];

        int max1 = findMaxAmount(nums, 0, n-2);
        int max2 = findMaxAmount(nums, 1, n-1);

        return Math.max(max1, max2);
    }

    public int findMaxAmount(int[] nums, int start, int end){
        //DP Pointers
        int t1 = 0; //current best 
        int t2 = 0; //prev current best

        //At each iteration we choose to either include or exclude the house
        for(int i = start; i <= end; i++){
            int temp = t1; // save current
            int current = nums[i];
            t1 = Math.max(t1, t2 + current);
            t2 = temp; //assign old value of t1 to t2
        }

        return t1;
    }
}