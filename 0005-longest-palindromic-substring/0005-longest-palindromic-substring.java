class Solution {
    public String longestPalindrome(String s) {
      
      //array to store length of longestPalindrom
      //start and end indices 
      int[] res = new int[] {0, 0};

      //Traverse through every char in s
      for(int i = 0; i < s.length(); i++){
        
        //Odd case - use helper
        int oddLen = lenPalindrome(i, i, s);
        if(oddLen > res[1] - res[0] + 1){
            //Update lengths in res
            int dist = oddLen / 2;
            res[0] = i -dist;
            res[1] = i + dist;
        }

        //Even case - use helper
        int evenLen = lenPalindrome(i, i+1, s);
        if(evenLen > res[1] - res[0] + 1){
             //Update lengths in res
            int dist = (evenLen / 2) - 1;
            res[0] = i - dist;
            res[1] = i + 1 + dist;
            }  
      }

        //return substring
        int start = res[0];
        int end = res[1];
        return s.substring(start, end+1);
    }

    public int lenPalindrome(int i, int j, String s){

        int left = i;
        int right = j;

        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
             left--;
             right++;
        }

        return right - left - 1;
    }
}



/*  
           l= -1
            naman
                 r=5

                 5 - (-1) - 1 = 5
*/