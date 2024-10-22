class Solution {
    public int singleNumber(int[] nums) {
        
        HashSet<Integer> set = new HashSet<Integer>();

        int sum = 0;

        for(int n: nums){
            if(set.contains(n)){
                sum -= n;
            } else {
                set.add(n);
                sum += n;
            }
        }

        return sum;
    }
}