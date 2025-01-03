class Solution {
    public int[] twoSum(int[] numbers, int target) {
        //Two Pointer Approach
        int[] ans = new int[2];

        int left = 0;
        int right = numbers.length - 1;

        while(left < right){
            int sum = numbers[left] + numbers[right];

            if(sum == target){
                ans[0] = left + 1;
                ans[1] = right + 1;
                return ans;
            }

            if(sum > target){
                right --;
            }else{
                left ++;
            }
        }

        return ans;
    }
}