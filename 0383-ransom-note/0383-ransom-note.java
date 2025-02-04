class Solution {
    public boolean canConstruct(String r, String m) {

        if(r.length() > m.length()){
            return false;
        }

        int[] freq = new int[26];

        for(int i = 0; i < m.length(); i++){
            freq[m.charAt(i) - 'a']++;
        }

        for(int i = 0; i < r.length(); i++){
            if(freq[r.charAt(i) - 'a'] <= 0){
                return false;
            }

            freq[r.charAt(i) - 'a']--;
        }

        return true;
    }
}