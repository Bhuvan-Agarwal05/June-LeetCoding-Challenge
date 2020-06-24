class Solution {
    public int numTrees(int n) {
    
    int countUniqueTrees[] = new int[n + 1];
    countUniqueTrees[0] = 1;
    countUniqueTrees[1] = 1;
 
    for (int i = 2; i <= n; i++) 
    {
        for (int j = 1; j <= i; j++) 
        {
            countUniqueTrees[i] = countUniqueTrees[i] + (countUniqueTrees[i - j] * 
                             countUniqueTrees[j - 1]);
        }
    }
 
    return countUniqueTrees[n];
    }
}