class Solution {
    public boolean isValid(String s) {

        HashMap<Character, Character> map = new HashMap<>();

        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        Stack<Character> st = new Stack<>();

        for(char c: s.toCharArray()){
            if(!map.containsKey(c)){
                st.push(c);
            }else{
                if(st.isEmpty() || st.peek() != map.get(c)){
                    return false;
                }

                st.pop();
            }
        }

        return st.isEmpty();
    }
}


/*
    - Can the string be empty? - at least one 
    - string strictly has these characters - yes
    - 3 rules to comply

    - Iterate the string and find (), [], {}
    - If found, replace with empty string
    - repeat until string(s) are not found

    - return true if string is empty
    - return false if not empty



*/