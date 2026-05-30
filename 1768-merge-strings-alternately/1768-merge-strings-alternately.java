class Solution {
    public String mergeAlternately(String word1, String word2) {

        //Pointer approach
        StringBuilder sb = new StringBuilder();
        int p1 = 0;

        //Traverse both strings until one ends
        while(p1 < word1.length() && p1 < word2.length()){
            sb.append(word1.charAt(p1));
            sb.append(word2.charAt(p1));
            p1++;
        }

        sb.append(word1.substring(p1));
        sb.append(word2.substring(p1));

        return sb.toString(); 
        
    }
}