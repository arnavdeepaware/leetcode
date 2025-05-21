class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        //Sliding Window Solution

        //Two Pointers
        int right = 0, left = 0;

        int minLength = Integer.MAX_VALUE; // Returning value
        int sum = 0;

        while(right < nums.length){
            sum += nums[right];

            while(left <= right && sum >= target){
                minLength = Math.min(minLength, right - left + 1);
                sum -= nums[left];
                left++;
            }

            right ++;
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;

    }
}

/*
    - We are given an array
    - Need to find LENGTH of subarray; min = 1
    - s.t. sum of subarray >= target

    - Empty array? -> atleast 1 element
    - Is it sorted? -> no
    - Negative numbers? -> positive
    - If target dne, return 0

    - Two pointers and sliding window approach
    - two pointers - both at start
    - Default sum is first element
    - If sum is less < target -- move right by one and add the new val to sum
    - else if sum >= target...
        - check for min length 
        - remove left pointer val from sum
        - move left pointer by one
    - end the loop when right exceeds the last element in nums

    - case when left and right are at the same point and sum >= target:
        - return 1 or when lenght of valid subarray is 1 .. return it
*/

