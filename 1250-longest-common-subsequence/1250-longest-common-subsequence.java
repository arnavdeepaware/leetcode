class Solution {
    public int longestCommonSubsequence(String text1, String text2) {

        /*
        - Create two 2d arrays c and b
        - Track the longest subsequence in c and directions in b

        - Use a 2D array traversal
        - i,j will represent the substrings in text1 and text2 respectively
        - x and y represent the len of lcs at i,j

        3 Cases:
        - i or j == 0, one or both the substrings are empty, max len = 0
        - i > 0, j > 0, and x == , same character, we have to add to our subsequnce length by incrementing the previous i and j => c-i-1, j-1]
        - i> 0, j > 0, x != y, copy the len of lcs of the greater value between c[i-1] or c[j-1]
        - Recursively Print the lcs
         */

        int[][] c = new int[text1.length()+ 1][text2.length() + 1];
        //int[][] b = new int[text1.length() + 1][text2.length() + 1];

        for(int i=1; i < c.length; i++){
            char x = text1.charAt(i-1);
            for(int j = 1; j < c[0].length; j++){
                char y = text2.charAt(j-1);

                //Case 1
                if(x == y){
                    c[i][j] = c[i-1][j-1] + 1;
                    //b[i,j] = 2;
                } else if(c[i-1][j] >= c[i][j-1]){
                    c[i][j] = c[i-1][j];
                    //b[i,j] = 3;
                } else{
                    c[i][j] = c[i][j-1];
                    //b[i,j] = 1;                    
                }
            }
        }

        return c[text1.length()][text2.length()];
    }





    



}