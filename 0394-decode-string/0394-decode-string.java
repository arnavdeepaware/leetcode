class Solution {
    public String decodeString(String s) {
        
        //Stacks
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();

        //curr variables
        int k = 0;
        StringBuilder currString = new StringBuilder();

        //Traversal
        for(char ch : s.toCharArray()){

            //Case 1: int - add to k
            if(Character.isDigit(ch)){
                //Mutliply k by 10 and then add lastest int as last digit
                k = k * 10 + (ch - '0');
            } 
            //Case 2: opening bracket, add to stack and reset curr variables
            else if(ch == '['){
                //Add to stacks
                countStack.push(k);
                stringStack.push(currString);
                //Reset
                k = 0;
                currString = new StringBuilder();
            }
            //Case 3: closing bracket, append currString k times to popped decodedString
            else if(ch == ']'){
                //Pop Decoded String
                StringBuilder decodedString = stringStack.pop();
                //Append currString k times
                for(int i = countStack.pop(); i > 0; i--){
                    decodedString.append(currString);
                }
                currString = decodedString;
            }
            //Case 4: char - add to currString
            else{
                currString.append(ch);
            }
        }

        return currString.toString();
    }
}


/*
    - need to generate a string from repeating substrings
    - ints are for #k, chars are for substring
    - two stacks? -> one more numbers, one for substrings

    - push every int onto the stack,
    - after the int, a opening bracket will follow
    - add following ints as needed
    - for everysubstring, add to second stack
    - at every closing bracket
            - if stack.size == 1, add computed string to output.
            - else 
                    - pop and compute string - call it 'curr'
                    - pop again (prev), compute prev + curr = new
                    - push new to stack
    - repeat until end of string

    countStack - store ints #k
    stringStack - store substring
    k - tracks current k
    currString - tracks current string (will append to this)
    decodedString - getds appended to currString after computing k times
*/