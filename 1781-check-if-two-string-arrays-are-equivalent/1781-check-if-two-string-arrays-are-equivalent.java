class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        
        /*
        if( word1.length() != word2.length()){
            return false;
        }
        */

        String w1 = "";
        for (String word: word1){
            w1 += word; 
        }

        String w2 = "";
        for (String word: word2){
            w2 += word;
        }

    return w1.equals(w2);
    }

}