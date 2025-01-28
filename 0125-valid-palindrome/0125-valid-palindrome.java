class Solution {
    public boolean isPalindrome(String s) {
        /*
            - Use a two pointer approach
            - Convert to lowercase
            - skip non-valid characters
            - if current valid pointers do not match, return false
            - at the end, return true
        */

        s = s.toLowerCase();

        int left = 0;
        int right = s.length() - 1;

        while(left < right){

            boolean cont = false;

            if(!Character.isLetterOrDigit(s.charAt(left))){
                left++;
                cont = true;
            }

            if(!Character.isLetterOrDigit(s.charAt(right))){
                right--;
                cont = true;
            }

            if(cont){
                continue;
            }

            if(s.charAt(left) != s.charAt(right)){
                return false;
            }

            left++;
            right--;
        }



        return true;
    }
}