class Solution {
    public int rob(int[] nums) {

        int n = nums.length;

        //Edge case
        if(n == 1) return nums[0];
        if(n == 2) return Math.max(nums[0], nums[1]);

        //Best choice for first two houses
        nums[1] = Math.max(nums[0], nums[1]);

        //Traversal
        for(int i = 2; i < n; i++){
            nums[i] = Math.max(nums[i] + nums[i-2], nums[i-1]);
        }

        return nums[n-1];
    }
}