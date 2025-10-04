class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int i = 0, j = height.length-1;
        while (i < j) {
            int cur = 0;
            int left = height[i], right = height[j];
            if (left <= right) {
                cur = (j-i) * left;
                while (i < j && height[i] <= left) i++;
            } else {
                cur = (j-i) * right;
                while (i < j && height[j] <= right) j--;
            }
            if (max < cur) max = cur;
        }
        return max;
    }
}