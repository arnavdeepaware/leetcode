class Solution {
    public int getKth(int lo, int hi, int k) {
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> {
            if(a[1] == b[1]){
                return a[0] - b[0];
            }

            return a[1] - b[1];
        });

        for(int i = lo; i <= hi; i++){
            int num = i;
            int count = 0;

            while(num != 1){
                if(num % 2 == 0){
                    num /= 2;
                }else{
                    num = (3 * num) + 1;
                }
                count++;
            }

            pq.add(new int[]{i, count});
        }

        while(k > 1){
            System.out.println(pq.poll()[1]);
            k--;
        }

        return pq.peek()[0];
    }
}