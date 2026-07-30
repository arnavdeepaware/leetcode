class Solution {
    public boolean isAnagram(String s, String t) {
        
        //Edge Case
        if(s.length() != t.length()) return false;

        //int[] of size 26
        int[] chars = new int[26];

        //Traver s and t
        for(int i = 0; i < s.length(); i++){
            
            char c;
            //Increment for s
            c = s.charAt(i);
            chars[c - 'a']++;

            //Decrement for t
            c = t.charAt(i);
            chars[c - 'a']--;
        }

        //Traversal to check for anagram
        for(int i = 0; i < chars.length; i++){
            if(chars[i] != 0) return false;
        }

        return true;
    }
}

/* 
    - return t/f
    - same strings -> true
    - len of s and t are same -> can be different
    - can either of the string be empty
    - lowercase chars only? -> yes


    - use int[] of size 26
    - increment the count of chars on the int[] for s
    - decrement the count for t
    - loop again and check if all values in int[] are 0,
                - if yes, return true;
                - i no, return false;

    - edge case(s); - t and s have diff len -> return False
*/