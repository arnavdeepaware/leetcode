class Solution {
    public int largestInteger(int num) {
        
        PriorityQueue<Integer> even = new PriorityQueue<>();
        PriorityQueue<Integer> odd = new PriorityQueue<>();

        int temp = num;

        while(temp > 0){
            if(temp % 2 == 0){
                even.offer(temp % 10);
            }else{
                odd.offer(temp % 10);
            }

            temp /= 10;
        }

        temp = num;
        int ans = 0;
        int multiplier = 1;

        while(temp > 0){
            if(temp % 2 == 0){
                ans += even.poll() * multiplier;
            }else{
                ans += odd.poll() * multiplier;
            }

            temp /= 10;
            multiplier *= 10;
        }

        return ans;
    }
}