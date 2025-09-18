class Solution {
    public boolean canMeasureWater(int x, int y, int target) {
        
        /*
            - target is only achievable if target is a multiple of the gcd (a,b)
            - gcd(a,b) is essentially the smallest possible am + bn
            - given the actions, filling, emptying, or transferring water between jugs, we can simple say that the combinations will be part of am + an
            - hence we need to return target % gcd(a,b) == 0
        */

        //Edge case
        if(x+y < target){
            return false;
        }

        int gcd = findGcd(x, y);

        return target % gcd == 0;
    }

    public int findGcd(int a, int b){   // Pre: x and y are positive
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}