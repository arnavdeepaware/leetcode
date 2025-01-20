class Solution {
    public int countSegments(String s) {

        int ct = 0;

        for(int i = 0; i < s.length(); i++){
            if((i == 0 || s.charAt(i-1)== ' ') && s.charAt(i) != ' '){
                ct++;
            }
        }    

        return ct;    
    }
}