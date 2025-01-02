class Solution {
    public long pickGifts(int[] gifts, int k) {
        
        //Creating and Populating the Queue
        PriorityQueue<Long> maxGifts = new PriorityQueue<>(Collections.reverseOrder());

        for(long gift: gifts){
            maxGifts.add(gift);
            System.out.println(maxGifts.peek());
        }

        while(k > 0){
            long max = maxGifts.poll();
            max = (long) (int) Math.sqrt(max);
            maxGifts.offer(max);

            k--;
        }

        long total = 0;
        //maxGifts.forEach(gift -> total += (long) gift);

        for(long gift: maxGifts){
            total += gift;
        }
        return total;


    }
}