class Solution {
    public int prefixCount(String[] words, String pref) {
        int count=0;

        for(String word: words){
            count += helper(word, pref);
        }

        return count;
    }

    public int helper(String word, String pref){

        if(pref.length() > word.length()){
            return 0;
        }

        for(int i=0; i < pref.length(); i++){
            if(word.charAt(i) != pref.charAt(i)){
                return 0;
            }
        }


        return 1;
    }
}