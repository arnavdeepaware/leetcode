class Solution {
    public int[] twoSum(int[] nums, int target) {
        /*
            - We need to store index and value
            - Use a hashmap
            - Traverse the array and keep adding the value to the hashmap
            - Check if target - value exists in the map
                - If yes, we have found our unique solution
                - If no, continue
        */

        int[] ans = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(nums[0], 0);

        for(int i = 1; i < nums.length; i++){
            //Check for target - value
            if(map.containsKey(target - nums[i])){
                ans[0] = i;
                ans[1] = map.get(target - nums[i]);
                return ans;
            }

            map.put(nums[i], i);
        }

        return ans;
    }
}