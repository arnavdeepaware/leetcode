class Solution {
    public String findDifferentBinaryString(String[] nums) {

        int n = nums[0].length();
        int possibilities = (int)Math.pow(2, n);

        Set<Integer> set = new HashSet<>();

        for(String num: nums){
            set.add(Integer.parseInt(num, 2));
            System.out.println(Integer.parseInt(num, 2));
        }

        String res = "";

        for(int i = 0; i < possibilities; i++){
            
            if(!set.contains(i)){
                res = Integer.toBinaryString(i);
                break;
            }
        }

        while(res.length() < n){
            res = "0" + res;
        }

        return res;
    }
}