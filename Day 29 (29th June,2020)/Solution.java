class Solution {
    public int uniquePaths(int m, int n) {
        
        // This is Dynamic Problem Bottom Up Approach
        int[][] output = new int[m][n];
        for(int i=0;i<n;i++)
            output[m-1][i] = 1;
        for(int i=0;i<m;i++)
            output[i][n-1] = 1;
        
        for(int i=m-2;i>=0;i--)
        {
            for(int j=n-2;j>=0;j--)
            {
                output[i][j] = output[i+1][j] + output[i][j+1];
            }
        }
        return output[0][0];
    }
}