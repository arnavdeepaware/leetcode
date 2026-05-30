class Solution {
    public boolean isValid(String s) {

        /*
            
            Have a stack
            add all opening brackets
            for any closing bracket,
                - not good, if stack is empty
                - not good, if top opening bracket should match
                - good if opening matches

            return true if st is empty
        */

        //HashMap and stack
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        Stack<Character> st = new Stack<>();

        //Traversal of Input String
        for(char c : s.toCharArray()){
            //if opening bracket add to stack
            if(!map.containsKey(c)){
                st.push(c);
            }
            //if closing bracket
            else{
                if(st.isEmpty() || st.peek() != map.get(c)){
                    return false;
                }

                st.pop(); 
            }
        }

        return st.isEmpty();
        
    }
}