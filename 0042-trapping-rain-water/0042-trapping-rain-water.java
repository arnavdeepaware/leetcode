class Solution {
    public int trap(int[] height) {
        
        //Total water
        int water = 0;

        //Moving Pointers
        int left = 0, right = height.length - 1;
        
        //Max pointers
        int leftMax = height[left], rightMax = height[right];

        while(left < right){
            //Compare which side is smaller
            if(height[left] < height[right]){
                //Update left side and add to water
                leftMax = Math.max(leftMax, height[left]);
                water += leftMax - height[left];
                left++;
            }else{
                //Update right side and add to water
                rightMax = Math.max(rightMax, height[right]);
                water += rightMax - height[right];
                right--;
            }
        }

        return water;
    }
}