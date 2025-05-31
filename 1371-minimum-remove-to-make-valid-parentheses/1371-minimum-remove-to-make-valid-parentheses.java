class Solution {
    public String minRemoveToMakeValid(String s) {

        Stack<Integer> st = new Stack<>();
        HashSet<Integer> map = new HashSet<>();

        int i = 0;
        for(char c: s.toCharArray()){
            if(c == '('){
                st.add(i);
            }
            else if(c == ')'){
                if(!st.empty()){
                    st.pop();
                }else{
                    map.add(i);
                }
            }
            i++;
        }

        while(!st.empty()){
            map.add(st.pop());
        }

        StringBuilder sb = new StringBuilder();

        for(i = 0; i < s.length(); i++){
            if(!map.contains(i)){
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
        
    }
}