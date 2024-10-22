class Solution {
    public boolean canJump(int[] nums) {
        
        /*
            - DP Approach
            - Traverse from back to front of array
            - At each iteration, check if target (indexes not values) is attainable
                - If yes, the current element is now the target
                - If not, continue
            - After loop termination, target should be index 0
                - If yes, we can reach the last index from the start: return True
                - If not, we cannot reach last index: return False;

            - Edge Cases
                - If nums.len == 1: return true
                - If first element is zero: return false
        */

        //Edge Cases

        //Array with single element
        if(nums.length == 1){
            return true;
        }

        //Array with starting element zero
        if(nums[0] == 0){
            return false;
        }

        //Starting target is last element
        int targetIndex = nums.length - 1;

        //Loop from back to start
        for(int i = nums.length - 2; i >= 0; i--){
            
            //Check if target index is attainable
            if(targetIndex <= i + nums[i]){
                targetIndex = i;
            }
        }

        //Check if target index is zero
        if(targetIndex == 0){
            return true;
        }
        //Else
        return false;

    }
}