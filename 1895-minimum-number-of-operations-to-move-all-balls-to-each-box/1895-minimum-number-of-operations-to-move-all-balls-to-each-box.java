class Solution {
    public int[] minOperations(String boxes) {
        
        int leftCount = 0;
        int rightCount = 0;
        int leftSum = 0;
        int rightSum = 0;
        int n = boxes.length();

        int[] balls = new int[n];

        int i = 0;
        for(char a: boxes.toCharArray()){
            int val = Character.getNumericValue(a);
            balls[i] = val;

            if(i == 0){
                i++;
                continue;
            }

            if(val == 1){
                rightCount ++;
                rightSum += i;
            }
            i++;
        }

        // System.out.println("Right Sum = " + rightSum + "\nRight Count = " + rightCount);
        int[] res = new int[n];
        res[0] = leftSum + rightSum;

        int curr = 0;
        int prev = balls[0];

        /*
             c
            110
            p

            left count = 0 = 1
            left sum = 0 = 1

            right count = 1 = 0
            right sum = 1 = 0
         */

         for(i = 1; i < n; i++){
            curr = balls[i];

            if(prev == 1){
                leftCount ++;
            }
            leftSum += leftCount;
            
            if(curr == 1){
                rightCount --;
                rightSum --;
            }

            rightSum -= rightCount;
            res[i] = leftSum + rightSum;

            prev = curr;
         }

         return res;
    }
}