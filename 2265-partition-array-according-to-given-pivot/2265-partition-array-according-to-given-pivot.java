class Solution {
    public int[] pivotArray(int[] nums, int pivot) {

        int smaller = 0;
        int equal = 0;

        for(int n: nums){
            if(n < pivot){
                smaller++;
            }else if(n == pivot){
                equal++;
            }
        }

        int s = 0;
        int e = smaller;
        int l = smaller + equal;

        int[] ans = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            if(nums[i] < pivot){
                ans[s] = nums[i];
                s++;
            }else if(nums[i] == pivot){
                ans[e] = nums[i];
                e++;
            }else{
                ans[l] = nums[i];
                l++;
            }
        }

        return ans;
        
    }
}