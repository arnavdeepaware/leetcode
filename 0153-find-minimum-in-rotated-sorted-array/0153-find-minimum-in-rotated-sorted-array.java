class Solution {
    public int findMin(int[] nums) {
        /*
            - Binary Search
            - 4 Cases
            - Every rotate has an inflection point where the min element is either first element or min is right after the max element
            - For mid
                - if mid + 1 is smaller: return mid + 1
                - if mid - 1 is smaller: return mid - 1; check edge case
            - If mid is smaller than last: check left half
            - else check rigth half        
         */

         int left = 0;
         int right = nums.length - 1;

         while(left <= right){

            if(left == right){
                return nums[left];
            }
            
            int mid = (left + right) / 2;
            int midNum = nums[mid];
            System.out.println(midNum);

            if(nums[mid + 1] < midNum){
                return nums[mid + 1];
            }

            if(mid > 0 && nums[mid - 1] > midNum){
                return midNum;
            }

            if(midNum < nums[right]){
                right = mid - 1;
                // System.out.println("right: " + right);
            }else{
                left = mid + 1;
            }
        }

        return nums[0];
    }
}