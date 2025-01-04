class Solution {
    public int maxArea(int[] height) {

        int left = 0;
        int right = height.length - 1;
        int max = 0;

        while(left < right){

            int width = right - left;
            int len = Math.min(height[left], height[right]);

            int area = width * len;
            max = Math.max(max, area);

            while(left < right && height[left] <= len){
                left++;
            }
            while(left < right && height[right] <= len){
                right --;
            }
        }

        return max;
        
    }
}