class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;

        for(int n: nums){
            if(helper(n)){
                count++;
            }
        }

        return count;
    }

    public boolean helper(int num){
        int c = 0;
        while (num > 0){
            num /= 10;
            c++;
        }

        return c % 2 == 0;
    }
}