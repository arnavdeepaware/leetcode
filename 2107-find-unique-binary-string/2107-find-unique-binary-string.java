class Solution {
    public String findDifferentBinaryString(String[] nums) {
        /*
            - Range of possible nums will be [0, 2^n)
            - Max 16 nums
            - Convert each from string-binary to int and store into a set
            - Loop from 2^n-1 to 0
            - find missing number and convert to string-binary
            - Return missing number
        */

        HashSet<Integer> set = new HashSet<Integer>();

        int n = nums.length;
        String ans = "0";

        for(int i = 0; i < nums.length; i++){
            int num = Integer.parseInt(nums[i], 2);
            set.add(num);
        }

        for(int i = (int) Math.pow(2, n) - 1; i >= 0; i--){
            if(set.contains(i)){
                continue;
            }else{
                return "0".repeat(n - Integer.toBinaryString(i).length()) + Integer.toBinaryString(i);
                // ans = Integer.toBinaryString(i);
            }
        }

        // while(ans.length() < n){
        //     ans = "0" + ans;
        // }

        return ans;
    }
}