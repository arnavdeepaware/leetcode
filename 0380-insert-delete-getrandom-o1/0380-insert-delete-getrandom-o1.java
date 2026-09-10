class RandomizedSet {

    //Class variables
    HashMap<Integer, Integer> map;
    ArrayList<Integer> list;
    Random rand = new Random();

    //Constructor
    public RandomizedSet() {
        this.map = new HashMap();
        this.list = new ArrayList();
    }
    
    //Insert helper
    public boolean insert(int val) {
        //If val is alr present
        if(map.containsKey(val)) return false;

        //Add val to map and list
        map.put(val, list.size());
        list.add(val);
        return true;
    }

    //Delete helper    
    public boolean remove(int val) {
        //If val is not present
        if(!map.containsKey(val)) return false;

        //Swap elements
        int lastVal = list.get(list.size() - 1);
        int index = map.get(val);
        map.put(lastVal, index);
        list.set(index, lastVal);

        //Delete last element
        list.remove(list.size() - 1);
        map.remove(val);
        return true;
    }
    
    public int getRandom() {
        //Generate a random index
        int random = rand.nextInt(list.size());
        return list.get(random);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */

/* 
    - Given the time constraints of O(1) for all three,
    - Hashmap and set is a good candidate for O(1) insertion, deletion and lookups
    - However, they can't return random elements since we need an index to retrieve an element from a randomly generated int (valid range)
    - An arraylist will help, we can randomly retrieve elements
    - Arraylist is also good with insertl
    - However, deleting from an aribitrary index takees O(n)
    - This can be solved if we are always deleting the last element of the arraylist
    - We can swap the last element with the deleting one and perform the operation
    - For this, we need to track indexes of each element in the arraylist

    - Hence we will use a combination of hashmap and arraylist to implement this class
*/