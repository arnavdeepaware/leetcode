
        /*
            - We need to check if there is a pair of ints in nums s.t. their sum = target
            - return a int pair of indices (array)
            - check for sums
            - array traversal, sorting, find one working case,
            - exaclty one solution
            - min input len = 2

                a
            - 2,7,11,15]
                   b

            sum = 18
            t = 18

            - nested loops
            - sorting - space efficient
            - hash set - time efficient with space trade off

        */

class Solution {
    public int[] twoSum(int[] nums, int target) {


        //Hashmap to store occurence of every input number
        HashMap<Integer, Integer> map = new HashMap<>();

        //Populate the map
        for(int i=0; i < nums.length; i++){
            int n = nums[i];
            if(map.containsKey(target - n)){
                return new int[]{i, map.get(target - n)};
            }

            map.put(n, i);
        }
        

        return new int[]{};
    }
}