class Solution {
    public int climbStairs(int n) {

        if(n == 1 || n == 2){
            return n;
        }
        
        int[] level = new int[n];
        level[0] = 1;
        level[1] = 2;

        for(int i = 2; i < n; i++){
            level[i] = level[i-1] + level[i-2];
        }

        return level[n-1];
        
    }
}