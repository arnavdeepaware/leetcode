class RecentCounter {

    Queue<Integer> counts;

    public RecentCounter() {
        counts = new LinkedList<>();
    }
    
    public int ping(int t) {
        counts.add(t);
        while (counts.peek() < t - 3000) {
            counts.poll(); // removes the oldest ping
        }
        return counts.size();
    }
}
/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */