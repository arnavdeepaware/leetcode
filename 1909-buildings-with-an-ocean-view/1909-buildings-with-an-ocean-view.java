class Solution {
    public int[] findBuildings(int[] heights) {

        int n = heights.length;

        if(n == 1){
            return new int[]{0};
        }

        Stack<Integer> st = new Stack<Integer>();
        st.push(n-1);

        for(int i = n-2; i >= 0; i--){
            if(heights[i] > heights[st.peek()]){
                st.push(i);
            }
        }

        int[] res = new int[st.size()];
        for(int i = 0; i < res.length; i++){
            res[i] = st.pop();
        }

        return res;
        
    }
}