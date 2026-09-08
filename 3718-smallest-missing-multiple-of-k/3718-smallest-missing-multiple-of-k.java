class Solution {
    public int missingMultiple(int[] nums, int k) {

        //Set to store numbers
        HashSet<Integer> seen = new HashSet<>();

        //Add all ints in nums to the set
        for(int n : nums){
            seen.add(n);
        }

        int ans = k;

        while(seen.contains(ans)) ans += k;

        return ans;
    }
}