class Solution {
    
    List<Integer> list;
    int sum;
    Random r;

    
    public Solution(int[] w) {
        list = new ArrayList<>();
        r = new Random();
        sum = 0;
        list.add(0);
        for(int i:w)
        {
            sum += i;
            list.add(sum);
        }
       // System.out.println(list);
    }
    
    public int pickIndex() {
        int idx = Collections.binarySearch(list,r.nextInt(sum));
        if(idx>=0)
            return idx;
        else
            return -(idx+2);
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */