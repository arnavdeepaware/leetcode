class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {

        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        int max = 1;

        //Left sum
        int ct = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                left[i] = ct;
                max = Math.max(max, ct);
                ct = 0;
            }else{
                ct++;
            }
        }

        max = Math.max(max, ct);

        ct = 0;
        for(int i = nums.length - 1; i >= 0; i--){
            if(nums[i] == 0){
                right[i] = ct;
                ct = 0;
            }else{
                ct++;
            }
        }

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                int curr = left[i] + right[i] + 1;
                max = Math.max(max, curr);
            }
        }

        return max;
        
    }
}