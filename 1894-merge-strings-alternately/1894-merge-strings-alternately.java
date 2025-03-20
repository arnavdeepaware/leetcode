class Solution {
    public String mergeAlternately(String word1, String word2) {

        //Two Pointer Approach
        /*
            - Can there spaces, special characters 
            - Empty inputs
            
            - Output String, two pointers, append any leftover string
            - Add p1 char then p2 char
            - Add the end of loop, check if any string still has chars left
                    - If yes, add to output string
            - return output string
        */


        //Pointers and Output String 
        int p1 = 0;
        int p2 = 0;
        StringBuilder sb = new StringBuilder();

        //Traverse the strings until we have chars in both
        while(p1 < word1.length() && p2 < word2.length()){
            //Add char from word1
            sb.append(word1.charAt(p1));
            p1++;

            //Add char from word2
            sb.append(word2.charAt(p2));
            p2++;
        }

        //Check if either string is pending
        if(p1 < word1.length()){
            sb.append(word1.substring(p1));
        } else if(p2 < word2.length()){
            sb.append(word2.substring(p2));
        }

        //Return output string
        return sb.toString();
    }
}