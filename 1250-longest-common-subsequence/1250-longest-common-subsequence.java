class Solution {
    public int longestCommonSubsequence(String text1, String text2) {

        /*
                p
            - "ace"
            - "abcde"
                q

            Case 1: chars match -> ans is 1 + len(longestcommonsubseq. of remaining strings)
            Case 2: chars dont match -> ans is between the two substrings where we exclude p once and then q

                a c e ""
            a   1     0
            b     A B 0
            c     C D 0
            d       E 0
            e       F 0
           ""   0 0 0 0

            Approach
            - initialize dp array[][] 
                of length text1.len * text2.len (m * n)
            
            - traverse the 2D dp array in reverse
            - at each element, consider the 2 cases
            - case 1: if true
                        -> assign dp[r][c]: 1 + diagonal value (dp[r+1][c+1])
            
            - else case2:
                        -> assign dp[r][c]: max between right and bottom value
            
            - end of traversal, return the first element of the dp array


            Edge Case / Notes
            - Empty String(s)? -> no
            - types of chars in input -> lowercase english char only, no spaces
            - assuming empty string can return 0
            - length of string? -> computable within standard data types of Java
            
        */

        int[][] dp = new int[text1.length() + 1][text2.length() + 1];

        for(int r = text1.length() - 1; r >= 0; r--){
            for(int c = text2.length() - 1; c >= 0; c--){

                //Case 1
                if(text1.charAt(r) == text2.charAt(c)){
                    dp[r][c] = 1 + dp[r+1][c+1];
                }else{  //Case 2
                    dp[r][c] = Math.max(dp[r][c+1], dp[r+1][c]);
                }
            }
        }

        return dp[0][0];
        
    }
}