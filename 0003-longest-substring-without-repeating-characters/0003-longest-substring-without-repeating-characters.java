class Solution {
    public int lengthOfLongestSubstring(String s) {


        /*
            - 2 cases
            - non-repeating char: continue
            - repeating char: 
                - before moving update max
                - move left while same char and less or equal to i
                - continue loop
            - ad
        */

        //Edge case
        if(s.length() < 2){
            return s.length();
        }

        HashSet<Character> currWord = new HashSet<>();
        currWord.add(s.charAt(0));

        int max = 1;
        int left = 0;

        for(int i = 1; i < s.length(); i++){
            //Check for repeating character
            if(currWord.contains(s.charAt(i))){

                //Move left pointer to the index of repeating char
                while(s.charAt(left) != s.charAt(i)){
                    currWord.remove(s.charAt(left));
                    left++;
                }

                //Move left pointer one ahead of the repeating char
                left++;
            }

            //Add right/i pointer char to currWord
            currWord.add(s.charAt(i));

            //Update max
            max = Math.max(max, currWord.size());
        }

        max = Math.max(max, currWord.size());

        return max;
    }
}