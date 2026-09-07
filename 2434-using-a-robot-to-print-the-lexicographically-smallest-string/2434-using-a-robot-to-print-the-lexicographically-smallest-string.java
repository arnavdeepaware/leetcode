class Solution {
    public String robotWithString(String s) {

        //Cnt Array
        int[] ct = new int[26];

        for(char c : s.toCharArray()){
            ct[c - 'a']++;
        }

        //Stack and min char
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        char minChar = 'a';

        //Loop
        for(char c : s.toCharArray()){
            //Add char from s to t and decrement it's count
            st.push(c);
            ct[c - 'a']--;

            //Update min character
            while(minChar != 'z' && ct[minChar - 'a'] == 0){
                minChar++;
            }

            //Empty Stack until it has <= min chars
            while(!st.isEmpty() && st.peek() <= minChar){
                sb.append(st.pop());
            }
        }

        return sb.toString();
    }
}