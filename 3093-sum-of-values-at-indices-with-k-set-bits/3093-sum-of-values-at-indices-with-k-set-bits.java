class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        
        /*
            - Initialize a sum
            - Traverse the list of nums
            - For every num, count the num of set bits
            - if setbits == k, add the num to sum

            - return sum
        */

        int sum = 0;

        for(int i = 0; i < nums.size(); i++){
            
            //Count the setbits
            int bitCount = 0;
            int n = i;

            while(n != 0){
                bitCount += n & 1;
                n >>= 1;
            }

            if(bitCount == k){
                sum += nums.get(i);
            }
        }

        return sum;

    }
}