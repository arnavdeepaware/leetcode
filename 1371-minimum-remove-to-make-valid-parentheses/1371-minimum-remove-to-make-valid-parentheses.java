class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder first = helper(s, '(', ')');
        StringBuilder res = helper(first.reverse().toString(), ')', '(');
        return res.reverse().toString();
    }

    public StringBuilder helper(String s, char open, char close){
        StringBuilder sb = new StringBuilder();

        int n = 0;
        for(char c: s.toCharArray()){
            if(c == open){
                n++;
            }else if(c == close){
                if(n > 0){
                    n--;
                }else{
                    continue;
                }
            }

            sb.append(c);
        }

        return sb;
    }
}