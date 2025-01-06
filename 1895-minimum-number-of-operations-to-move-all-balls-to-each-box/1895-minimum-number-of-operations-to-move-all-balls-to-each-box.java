class Solution {
    public int[] minOperations(String boxes) {
        // Find prefix sum and minOperations from left side
        // Find suffix sum and minOperation from right side
        // Add the two and return ans
        
        int n = boxes.length();

        //Left side and Prefix
        int[] left = new int[n];
        int prefix = Character.getNumericValue(boxes.charAt(0));
        int prev = 0;

        for(int i=1; i<n; i++){
            left[i] = prev + prefix;
            prefix += Character.getNumericValue(boxes.charAt(i));
            prev = left[i];
        }   

        //Right side and suffix
        // int[] right = new int[n];
        int suffix = Character.getNumericValue(boxes.charAt(n-1));
        prev = 0;

        for(int i = n-2; i >= 0; i--){
            int curr = prev + suffix;
            left[i] += curr;
            suffix += Character.getNumericValue(boxes.charAt(i));
            prev = curr;
        }

        // for(int i=0; i <n; i++){
        //     left[i] += right[i];
        // }

        return left;
    }
}