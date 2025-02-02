class Solution {
    public int lengthOfLastWord(String s) {
        
        int len = 0;
        int prev = 0;

        for(char c: s.toCharArray()){
            if(c == ' '){
                if(len > 0){
                    prev = len;
                }
                len = 0;
            }else{
                len++;
            }
        }

        if(len < 1){
            return prev;
        }
        return len;
    }
}