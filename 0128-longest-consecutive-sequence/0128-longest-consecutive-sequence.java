class Solution {
    public int longestConsecutive(int[] nums) {
        
        HashSet<Integer> set = new HashSet<>();
        for(int n: nums){
            set.add(n);
        }

        int longestStreak = 0;
        int streak = 0;

        for(int n: set){
            if(!set.contains(n - 1)){
                int curr = n;
                streak = 1;

                while(set.contains(n+1)){
                    n++;
                    streak ++;
                }

                longestStreak = Math.max(longestStreak, streak);
            }
        }

        return longestStreak;
    }
}