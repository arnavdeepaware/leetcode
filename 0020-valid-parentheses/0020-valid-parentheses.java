class Solution {
    /*
        - String be empty?
    
        - Use stack to keep order of parentheses
        - Use hashmap to pair opening and closing types
        - traverse the input
        - if opening bracket, add to stack
        - if not, i.e. closing bracket:
                - check if stack is not empty (shouldn't be to be valid)
                - it should be of same type as top element of stack to be valid
                - if valid, pop the top element, continue
                - else not valid, return false
                
        - At the end, check if stack is empty
        - If yes, we have a valid input, return true
        - else return false
    */

    
    public boolean isValid(String s) {
        
        //Hashmap
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        //Stack
        Stack<Character> st = new Stack<>();

        //Traversal
        for(char c: s.toCharArray()){
            
            //Check for opening bracket
            if(!map.containsKey(c)){
                st.add(c);
                
            }else{
                if(st.empty() || map.get(c) != st.pop()){
                    return false;
                }
            }
        }

        if(!st.empty()){
            return false;
        }

        return true;
        
    }
}

