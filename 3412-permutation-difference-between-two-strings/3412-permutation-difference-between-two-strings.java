class Solution {
    public int findPermutationDifference(String s, String t) {
        //use hashmaps
        // use index of and charAt functions

        int res = 0;
        for(int i = 0; i < s.length(); i++){
            res += Math.abs(t.indexOf(s.charAt(i)) - i);
        }

        return res;
    }
}