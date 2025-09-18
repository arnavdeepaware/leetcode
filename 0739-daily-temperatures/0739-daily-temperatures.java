class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        //Edge Case
        if(temperatures.length == 1) return new int[1];

        int[] res = new int[temperatures.length];
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < temperatures.length; i++){
            //If st is empty.. add temp
            if(st.empty()) st.push(i);

            else{
               //Case 1: we have a warmer day
                //Iterate until case 2 is true or st is empty
                while(!st.empty() && temperatures[st.peek()] < temperatures[i]){
                    int colderDayIndex = st.pop();
                    res[colderDayIndex] = i - colderDayIndex;
                }

               //Case 2: we have a colder day
               st.push(i);
            }
        }

        return res;
    }
}