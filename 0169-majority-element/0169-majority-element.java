class Solution {
    public int majorityElement(int[] nums) {
        
        /*
            U - Understand
            - Min. length of input array?
            - Does the answer always exist?

            -> 5 3 5 5 3

            - Count variable and tempX
            - iterate through nums
            - assign tempX as nums[0]
            - At each iteraton
                    - if num[i] == tempX
                        - increase count
                    - else
                        - decrease count
                        - if count == 0
                        - tempX = nums[i] -- check for last element 

            - return tempX
        */

        int target = nums.length / 2;

        HashMap<Integer, Integer> count = new HashMap<>();

        for(int num: nums){
            int ct = count.getOrDefault(num, 0);
            ct++;

            if(ct > target) return num;
            count.put(num, ct);
        }

        return -1;
    }
}