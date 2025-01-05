class Solution {
    public int subarraySum(int[] nums, int k) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int prefix = 0;
        int count = 0;

        for(int n: nums){
            prefix += n;

            if(map.containsKey(prefix - k)){
                count += map.get(prefix - k);
            }

            map.put(prefix, map.getOrDefault(prefix, 0) + 1);
        }

        return count;
    }
}