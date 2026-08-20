class Solution {
    public int maxArea(int[] height) {

        //Two pointers
        int l = 0;
        int r = height.length - 1;

        //Max Area
        int max = 0;

        //Traversal
        while(l < r){
            //Check area vs max
            int width = r - l;
            int length = Math.min(height[l], height[r]);

            max = Math.max(max, width * length);

            //Move smaller length pointer
            if(height[l] < height[r]) l++;
            else r--;
        }

        return max;
    }
}