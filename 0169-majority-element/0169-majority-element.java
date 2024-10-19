class Solution {
    public int majorityElement(int[] nums) {

        if(nums.length <= 2){
            return nums[0];
        }
        
        HashMap<Integer, Integer> map = new HashMap<>();

        int len = nums.length;
        len /= 2;

        for(int n: nums){
            if(map.containsKey(n)){
                int freq = map.get(n);
                if(++freq > len){
                    return n;
                }
                map.put(n, freq);
            }else{
                map.put(n, 1);
            }
        }

        return -1;
    }
}