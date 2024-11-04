class Solution {
    public int lengthOfLongestSubstring(String s) {

        // Edge Case
        if (s.length() < 2) {
            return s.length();
        }

        HashMap<Character, Integer> map = new HashMap<>();
        map.put(s.charAt(0), 0);

        int max = 0;
        int left = 0;

        for(int i = 1; i < s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                left = Math.max(left, map.get(s.charAt(i)) + 1);
            } 
            
            map.put(s.charAt(i), i);
            max = Math.max(max, i - left + 1);
        }

        return max;
    }
}