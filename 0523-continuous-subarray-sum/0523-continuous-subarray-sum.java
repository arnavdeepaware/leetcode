class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        /*
            - Prefix Sum approach
            - Store a hashmap with indexes
            - no count needed
            - Traverse the array
            - Find prefix mod
            - Check if it exists
                - Check for adjacency
            - If not, update map
        */

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int prefixMod = 0;
        int i = 0;

        for(int n: nums){
            prefixMod = (prefixMod + nums[i]) % k;

            if(map.containsKey(prefixMod)){
                //Check for adjacency
                if(i - map.get(prefixMod) > 1){
                    return true;
                }
            }else{
                map.put(prefixMod, i);
            }

            i++;
        }

        return false;
    }
}