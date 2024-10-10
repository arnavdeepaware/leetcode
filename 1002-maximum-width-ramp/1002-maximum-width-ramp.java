 class Solution {
    public int maxWidthRamp(int[] nums) {
        
        /*
            ans = 8
            ramp = 0 = 4

              l
            - 8 8 7 5 4 5 5 5 0 
                              j

            - 9 9 9 9 8 8 8 8 8
                              r
        */

        Stack<Integer> st = new Stack<Integer>();

        for(int i = 0; i < nums.length; i++){
            
            if(st.empty()){
                st.push(i);
                continue;
            }
            
            if(nums[i] < nums[st.peek()]){
                st.push(i);
            }
        }

        int ramp = 0;

        for(int j = nums.length - 1; j >= 0; j--){
            while(!st.empty() && nums[j] >= nums[st.peek()]){
                ramp = Math.max(ramp, j - st.pop());
            }
        }

        return ramp;

        
    }

}