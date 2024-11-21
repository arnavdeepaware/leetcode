class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        
        int[] less = new int[nums.length];
        int[] great = new int[nums.length];
        int pivotCount = 0;

        int i = 0;
        int j = 0;

        for(int n: nums){
            if(n < pivot){
                less[i] = n;
                i++;
            }else if(n > pivot){
                great[j] = n;
                j++;
            }else{
                pivotCount++;
            }
        }

        for(int k = 0; k < i; k++){
            nums[k] = less[k];
        }

        for(int k = i; k < i + pivotCount; k++){
            nums[k] = pivot;
        }

        for(int k = i + pivotCount; k < i + pivotCount + j; k++){
            nums[k] = great[k - i - pivotCount];
        }

        return nums;
    }
}