class Solution {
    public int lengthOfLongestSubstring(String s) {


        /*
            - 2 cases
            - non-repeating char: continue
            - repeating char: 
                - before moving update max
                - move left while same char and less or equal to i
                - continue loop
        */

        //Edge Case
        if(s.length() < 2){
            return s.length();
        }
        
        //Vars
        int max = 1;
        int left = 0;

        //Set
        HashSet<Character> currWord = new HashSet<>();
        currWord.add(s.charAt(0));

        //Traversal
        for(int i = 1; i < s.length(); i++){

            //Check repeating chars
            if(currWord.contains(s.charAt(i))){

                //Move left pointer
                while(s.charAt(left) != s.charAt(i)){
                    currWord.remove(s.charAt(left));
                    left++;
                }
                left++;
            }

            currWord.add(s.charAt(i));
            //Update Max
            max = Math.max(currWord.size(), max);
        }

        max = Math.max(currWord.size(), max);
        return max;
    }
}