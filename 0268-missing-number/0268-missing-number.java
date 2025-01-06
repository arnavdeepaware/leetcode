class Solution {
    public int missingNumber(int[] nums) {
        
        int targetSum = 0;
        int actualSum = 0;

        for(int i=0; i<nums.length; i++){
            targetSum += i;
            actualSum += nums[i];
        }

        targetSum += nums.length;

        return targetSum - actualSum;
    }
}