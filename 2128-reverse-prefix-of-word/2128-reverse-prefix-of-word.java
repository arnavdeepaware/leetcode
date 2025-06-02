class Solution {
    public String reversePrefix(String word, char ch) {

        int idx = word.indexOf(ch);
        if(idx == -1){
            return word;
        }

        StringBuilder sb = new StringBuilder();

        for(int i = idx; i >= 0; i--){
            sb.append(word.charAt(i));
        }

        for(int i = idx + 1; i < word.length(); i++){
            sb.append(word.charAt(i));
        }

        return sb.toString();

        
        
    }
}