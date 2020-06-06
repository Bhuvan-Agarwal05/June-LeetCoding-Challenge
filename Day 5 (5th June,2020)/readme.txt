This Code is being tested with 57 TestCases...

The problem is, we need to randomly pick an index proportional to its weight.
What this means? 
We have weights array, each
weights[i]  represents weight of index i. 
The more the weight is, then high chances of getting that index randomly.

suppose weights = [1, 3]
then 3 is larger, so there are high chances to get index 1.

We can know the chances of selecting each index by knowing their probability.

P(i) = weight[i]/totalWeight

totalWeight = 1 + 3 = 4
So, for index 0, P(0) = 1/4  = 0.25 = 25%
for index 1, P(1) = 3/4 = 0.75 = 75%

So, there are 25% of chances to pick index 0 and 75% chances to pick index 1.


More Effective Solution :-
 class Solution {
    private double[] probab;
    
    public Solution(int[] w) {
        double sum = 0;
        this.probab = new double[w.length];
        for(int weight : w)
            sum += weight;
        for(int i = 0; i < w.length; i++){
            w[i] += (i == 0) ? 0 : w[i - 1];
            probab[i] = w[i]/sum; 
        }
    }
     
    public int pickIndex() {
        return Math.abs(Arrays.binarySearch(this.probab, Math.random())) - 1;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */
