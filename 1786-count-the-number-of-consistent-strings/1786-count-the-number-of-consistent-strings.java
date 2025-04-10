class Solution {
    public int countConsistentStrings(String allowed, String[] words) {

        //Hashset
        HashSet<Character> allowedChars = new HashSet<>();

        //Add allowed chars to our set
        for(char c: allowed.toCharArray()){
            allowedChars.add(c);
        }

        //For every word - check if each char is allowed or not
        // if not skip the word
        // if yes, increase the count

        int count = 0;
        for(String word: words){
            boolean isValid = true;
            for(char c : word.toCharArray()){
                if(!allowedChars.contains(c)){
                    isValid = false;
                    break;
                }
            }
            if (isValid) count++;
        }

        return count;
        
    }
}