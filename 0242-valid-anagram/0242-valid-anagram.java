class Solution {
    public boolean isAnagram(String s, String t) {

        /*
            - check if t has
                - same length as s
                - same freq of all chars in s
            
            - Use a hashset/map. --> map to store frequency as well
            - Traverse s and populate the hashmap
            - Traverse t and check for each char
                - if char exists in the map and has freq > 0
                - if not, we cannot make anagram
                - Else, anagram is possible till ith index

            - By the end, i is at the last index => anagram is possible
        */

        //Edge case
        if(s.length() != t.length()){
            return false;
        }

        HashMap <Character, Integer> freq = new HashMap<>();

        //Populate the hashmap
        for(char c : s.toCharArray()){
            int temp = freq.getOrDefault(c, 0);
            temp++;
            freq.put(c, temp);
        }

        //Check for anagram in t
        for(char c: t.toCharArray()){
            int temp = freq.getOrDefault(c, 0);
            if(temp <= 0){
                return false;
            }

            temp --;
            freq.put(c, temp);
        }

        return true;
    }
}