class Solution {
    public int singleNumber(int[] nums) {
        if(nums.length==1)
            return nums[0];
        else
        {
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int i:nums)
            {
                if(map.containsKey(i))
                    map.put(i,map.get(i)+1);
                else
                    map.put(i,1);
            }
            
            for(int i:map.keySet())
                if(map.get(i)==1)
                    return i;
            
            return -1;
        }
    }
}