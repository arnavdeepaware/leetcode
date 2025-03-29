class RandomizedSet {
    List<Integer> nums;
    HashMap<Integer, Integer> map;
    Random rand = new Random();

    //Constructor
    public RandomizedSet() {
        nums = new ArrayList<>();
        map = new HashMap<>();
    }
    
    
    public boolean insert(int val) {
        if(map.containsKey(val)){
            return false;
        }        

        map.put(val, nums.size());
        nums.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if(!map.containsKey(val)){
            return false;
        }

        int last = nums.get(nums.size() - 1);
        int idx = map.get(val);
        nums.set(idx, last);
        map.put(last, idx);
        nums.remove(nums.size() - 1);
        map.remove(val);

        return true;
    }
    
    public int getRandom() {
        System.out.println(nums.get(0));
        return nums.get(rand.nextInt(nums.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */