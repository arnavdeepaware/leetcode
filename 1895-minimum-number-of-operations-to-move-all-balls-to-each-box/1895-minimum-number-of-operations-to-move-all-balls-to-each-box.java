class Solution {
    public int[] minOperations(String boxes) {
        // Find prefix sum and minOperations from left side
        // Find suffix sum and minOperation from right side
        // Add the two and return ans
        
        int n = boxes.length();

        //Left side and Prefix
        int[] left = new int[n];
        int prefix = Character.getNumericValue(boxes.charAt(0));
        left[0] = 0;

        for(int i=1; i<n; i++){
            left[i] = left[i-1] + prefix;
            prefix += Character.getNumericValue(boxes.charAt(i));
        }   

        //Right side and suffix
        int[] right = new int[n];
        int suffix = Character.getNumericValue(boxes.charAt(n-1));
        right[n-1] = 0;

        for(int i = n-2; i >= 0; i--){
            right[i] = right[i+1] + suffix;
            suffix += Character.getNumericValue(boxes.charAt(i));
        }

        for(int i=0; i <n; i++){
            left[i] += right[i];
        }

        return left;
    }
}