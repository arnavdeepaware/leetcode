class Solution {
    public int findMin(int[] nums) {
        
        int lo = 0;
        int hi = nums.length - 1;

        while(lo < hi){
            int mid = (lo + hi) / 2;
            int num = nums[mid];

            if(num > nums[hi]){
                lo = mid + 1;
            }else{
                hi = mid;
            }
        }

        return nums[lo];
    }
}