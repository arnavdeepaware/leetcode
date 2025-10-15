class Solution {
    public int countSubstrings(String s) {

        /*
            - empty string
            - lowercase english letters only? spaces?
            - return num of palindromic strings? not the list of substrings 
            
            "abc"       "aaa"
             a           a
             ab          aa
             abc         aaa
             b           a
             bc          aa
             c           a
             
            
            
            - check palindrome function
                    two start pointers
                    count variable
                    loop until out of chars or border chars dont match
                    at every iteration, move the pointers outwards and increment count

                    return the count

            - edge case: none
            - total variable
            - loop through each char in s
            - use helper function for both even and odd cases
            - add both cases to total
            - return total
        */

        int total = 0;

        //Loop through every char in s
        for(int i = 0; i < s.length(); i++){
            total += numOfPalindrome(s, i, i);      //odd case
            total += numOfPalindrome(s, i, i+1);    //even case
        }

        return total;
    }

    //Helper function to return num of palindromes from a center
    public int numOfPalindrome(String s, int lo, int hi){

        int count = 0;

        while(lo >= 0 && hi < s.length()){
            if(s.charAt(lo) != s.charAt(hi)) break;

            lo--;
            hi++;

            count++;
        }

        return count;
    }
}