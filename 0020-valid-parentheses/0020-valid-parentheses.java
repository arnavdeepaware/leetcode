class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> st = new Stack<>();
        HashMap<Character, Character> map = new HashMap<>();

        map.put(')', '(');
        map.put('}', '{');
        map.put(']','[');

        for(char c: s.toCharArray()){
            //If char is opening tag
            if(!map.containsKey(c)){
                st.push(c);
            }else{
                if(st.empty() || st.pop() != map.get(c)){
                    return false;
                }
            }
        }

        return st.empty();
        
    }
}