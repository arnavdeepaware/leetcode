class Solution {
    public int lengthOfLongestSubstring(String s) {
        /*
            - Use two pointers and set
            - Use the set to keep track of char occurences
            - Use two pointers to traverse the array

            - Start with two pointers
            - Check if substring is valid or not
            - If valid, 
                - Add length to curr
                - Add the char to set
                - Move right pointer forward
            - If not valid,
                - Update max between max and curr
                - Change curr to zero
                - remove left pointer char from the set
                - Move the left pointer until there a new char or left == right
                - If left == right - move right by one, curr = 1
            - Return max      

            Edge Cases:
                - Empty String   
        */

        //Edge Case
        if(s.length() < 1){
            return 0;
        }

        int i =0;
        int ans = 0;
        HashSet<Character> set = new HashSet<>();

        for(int j = 0; j < s.length(); j++){
            while(set.contains(s.charAt(j))){
                set.remove(s.charAt(i++));
            }

            set.add(s.charAt(j));
            ans = Math.max(ans, j - i + 1);
        }

        return ans;
    }
}