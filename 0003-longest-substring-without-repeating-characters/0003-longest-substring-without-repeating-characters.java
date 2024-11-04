class Solution {
    public int lengthOfLongestSubstring(String s) {

        // Edge Case
        if (s.length() < 2) {
            return s.length();
        }

        HashSet<Character> set = new HashSet<>();
        set.add(s.charAt(0));

        int n = s.length();
        int max = 0;
        int r = 1;
        int l = 0;

        while (r < n) {

            // Repeating characters
            if (set.contains(s.charAt(r))) {
                while (s.charAt(l) != s.charAt(r)) {
                    set.remove(s.charAt(l));
                    l++;
                }
                l++;
            }
            // Non-Repeating Characters
            else {
                set.add(s.charAt(r));
            }

            max = Math.max(max, r - l + 1);
            r++;

        }

        return max;
    }
}