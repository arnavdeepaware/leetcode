class Solution {
    public boolean isHappy(int n) {

        HashSet<Integer> set = new HashSet<Integer>();

        while(n != 1){
            set.add(n);
            n = helper(n);

            if(set.contains(n)){
                return false;
            }
        }

        return true;        
    }

    public int helper(int n){
        int sum = 0;

        while(n > 0){
            int digit = n % 10;
            n/= 10;
            sum += digit * digit;
        }

        return sum;
    }
}