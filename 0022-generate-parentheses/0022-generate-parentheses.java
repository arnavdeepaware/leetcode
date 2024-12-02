class Solution {
    public List<String> generateParenthesis(int n) {
     /*
        - Create a recursive function
        - Give the list, and parenthesis left
        - Base case when no parenthesis are left -> append string to answer list
        - Case 2: start == close -> need to use a starter to maintain validity
        - Case 3: close > start -> can use both cases
        - Case 1: If start == 0 and close > 1 -> need to use close
      */   

      List<String> answer = new ArrayList<>();
    //   StringBuilder sb = new StringBuilder();
    String s = "";
      helper(answer, s, n, n);
      return answer;

    }

    public void helper(List<String> answer, String s, int start, int end){
        
        System.out.println("Start = " + start + "\tend = " + end);
        //Base Case
        if(start == 0 && end == 0){
            answer.add(s);
            return;
        }

        //Case 1
        if(start == 0){
            // sb.append(')');
            end--;
            helper(answer, s+")", start, end);
            return;
        }

        //Case 2
        if(start == end){
            // sb.append('(');
            start--;
            helper(answer, s+"(", start, end);
            return;
        }

        //Case 3
        // sb.append('(');
        helper(answer, s+"(", start - 1, end);
        // sb = sb.delete(sb.length()-1, sb.length());
        // sb.append(')');
        helper(answer, s+")", start, end - 1);


    }
}