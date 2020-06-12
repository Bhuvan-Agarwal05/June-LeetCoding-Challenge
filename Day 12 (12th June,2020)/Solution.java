class RandomizedSet {

    /** Initialize your data structure here. */
    HashMap<Integer,Integer> map;
    Random r;
    public RandomizedSet() {
        map = new HashMap<>();
        r=new Random();
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if(!map.containsKey(val))
           {
            map.put(val,val);
            return true;
            }
        return false;
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if(map.containsKey(val))
            {
            map.remove(val);
            return true;
            }
        return false;
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
        int i = r.nextInt(map.size());
        return (int)map.values().toArray()[i];
        
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */