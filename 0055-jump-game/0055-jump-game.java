class Solution {
    public boolean canJump(int[] nums) {

        int max = nums[0]; 

        for(int i = 1; i < nums.length - 1; i++){

            if( i > max){
                return false;
            }
            int jumpPos = i + nums[i];

            max = Math.max(max, jumpPos);
        }

        return max >= nums.length - 1;
        
    }
}