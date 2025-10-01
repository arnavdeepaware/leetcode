class Solution {
    public int triangularSum(int[] nums) {

        int[] temp = new int[nums.length - 1];

        while(nums.length > 1){
            int n = nums.length;
            temp = new int[n - 1];

            for(int i = 0; i < n-1; i++){
                temp[i] = (nums[i] + nums[i+1]) % 10;
            }

            nums = temp;
        }

        return nums[0];
        
    }
}