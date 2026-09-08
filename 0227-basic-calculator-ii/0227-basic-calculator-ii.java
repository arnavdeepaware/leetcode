class Solution {
    public int calculate(String s) {

        if (s == null || s.isEmpty()) return 0;
        int len = s.length();
        Stack<Integer> stack = new Stack<Integer>();
        int currentNumber = 0;
        char operation = '+';
        for (int i = 0; i < len; i++) {
            char currentChar = s.charAt(i);
            if (Character.isDigit(currentChar)) {
                currentNumber = (currentNumber * 10) + (currentChar - '0');
            }
            if (!Character.isDigit(currentChar) && !Character.isWhitespace(currentChar) || i == len - 1) {
                if (operation == '-') {
                    stack.push(-currentNumber);
                }
                else if (operation == '+') {
                    stack.push(currentNumber);
                }
                else if (operation == '*') {
                    stack.push(stack.pop() * currentNumber);
                }
                else if (operation == '/') {
                    stack.push(stack.pop() / currentNumber);
                }
                operation = currentChar;
                currentNumber = 0;
            }
        }
        int result = 0;
        while (!stack.isEmpty()) {
            result += stack.pop();
        }
        return result;
    }
}


/*
    - can string be empty or null
    - whitespaces?
    - parentheses?
    - multi-digit or single digit numbers?
    - 4 operations only?
    - valid string and valid mathematical expression?

    - Given the arithmetic precedence, * and / come first then + and -
    - From the examples, * and / are computed right away
                       , + and - are computed later
    
    - Stack would be useful to store + and - numbers to be computed later
    

    - Edge cases: empty or null string
    - Case 1: digit, simply append to current number
    - Case 2: operation 
            2a: * and divide, 


*/

