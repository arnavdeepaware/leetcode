class Solution {
    public String clearDigits(String s) {

        Stack<Character> st = new Stack<>();

        for(char c: s.toCharArray()){
            if(c - 'a' >= 0 && c - 'a' < 26){
                st.push(c);
            }else{
                st.pop();
            }
        }

        StringBuilder sb = new StringBuilder();

        while(!st.empty()){
            sb.append(st.pop());
        }

        sb.reverse();
        return sb.toString();
        
    }
}