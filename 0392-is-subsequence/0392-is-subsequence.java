class Solution {
    public boolean isSubsequence(String s, String t) {
        
        if(s.length() > t.length()){
            return false;
        }

        if(s.length() == 0){
            return true;
        }

        int left = 0;

        for(int i = 0; i < t.length(); i++){
            if(t.charAt(i) == s.charAt(left)){
                left++;
            }

            if(left >= s.length()){
                return true;
            }
        }

        return false;
    }
}