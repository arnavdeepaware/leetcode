class Solution {
    public boolean isAnagram(String s, String t) {

        //Edge case
        if(s.length() != t.length()) return false;

        //Initialize count array
        int[] count = new int[26];

        //Populate the count array
        for(int i = 0; i < s.length(); i++){
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for(int i : count){
            if(i != 0) return false;
        }

        return true;
        
    }
}